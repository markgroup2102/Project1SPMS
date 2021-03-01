package com.revature.services;

import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.data.DaoFactory;
import com.revature.data.PersonDao;
import com.revature.data.StoryPitchDao;
import com.revature.data.StoryPitchStatusDao;
import com.revature.data.StoryTypeDao;
import com.revature.models.Person;
import com.revature.models.StoryDraft;
import com.revature.models.StoryPitch;
import com.revature.models.StoryPitchStatus;
import com.revature.models.StoryType;
import com.revature.utilities.HibernateUtil;

public class PersonService {
	private static Logger log = Logger.getLogger(PersonService.class.getName());
	private PersonDao personDao = DaoFactory.getPersonDao();
	private StoryTypeDao storyTypeDao = DaoFactory.getStoryTypeDao();
	private StoryPitchDao storyPitchDao = DaoFactory.getStoryPitchDao();
	private StoryPitchStatusDao storyPitchStausDao = DaoFactory.getStoryPitchStatusDao();
	public PersonService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns a person by their id
	 * @param person
	 * @return
	 */
	public Person getPersonById(Integer id) {
		log.trace("Getting person by id");
		if(id == null) {
			log.debug("Null id passed, returning null");
			return null;
		}
		return personDao.readPersonById(id);
	}
	
	public boolean validatePitchHasAllFields(StoryPitch storyPitch) {
		// We need to validate the Story
				// Each one of these fields must have an entry or we reject the pitch
				
			// NOTES
			// pitchId will be set in the db 
			// type will be set by pagecount
			// status will be set in submit pitch
			// priority will be set in submit pitch
			Integer authorId = storyPitch.getAuthorId();
			Integer pgcount = storyPitch.getPageCount();
			String description = storyPitch.getDescription();
			String genre = storyPitch.getGenre();
			String tagLine = storyPitch.getTagLine();
			String title =storyPitch.getTitle();
			
			
			// This segment is not purely to java 
			// coding style to increase overall readability
			log.trace("Validating story pitch parameters");
			if(authorId == null 
					|| authorId <= 0
					|| pgcount == null 
					|| pgcount <= 0
					|| description == null
					|| description == ""
					|| genre == null
					|| genre == ""
					|| tagLine == null
					|| tagLine == ""
					|| title == null
					|| title == "") 
			{
				log.debug("Null or bad value detected, returning null value");
				return false;
			}else {
				return true;
			}
	}
	
	public boolean validateUserIsAuthor(Integer id) {
		log.trace("Validating the user is an author");
		boolean isAuthor = false;
		Person p = this.getPersonById(id);
		if(p != null && p.getRole().contains("author")) {
			isAuthor = true;
		}else {
			log.debug("Null or non author detected. Returning false;");
		}
		return isAuthor;
	}
	
	public StoryType getStoryTypeByPageCount(Integer pages) {
		log.trace("Getting story id by page count");
		
		// The weight cannot be zero or null otherwise it will break the 
		// next algorithm.
		if(pages == null || pages <= 0) {
			log.debug("Invalid value detected, setting page count to max weight value");
			pages = 999999;
		}
		
		int weight = 0;
		StoryType type =  null;
		for(StoryType st : storyTypeDao.getAllStoryTypes()) {
			if(pages > weight) {
				type = st;
			}
			weight = st.getWeightedValue();
			// Each 'box' has a weight limit the first is 0 to x
			// this code checks if the target exceeds the weight limit
			// if it does the weight limit moves to the next box and the item
			// is checked again. the only caveat is that the weight cannot be 0;
		}
		return type;
	}
	
	/**
	 * Submits a story pitch 
	 * Some parameters will be calculated here
	 * priority, type, status, id will be generated in DAO
	 * this also updates the user's point total
	 * @param storyPitch
	 * @return
	 */
	public StoryPitch submitStoryPitch(StoryPitch storyPitch) {
		log.trace("Submitting a story pitch");
		final Integer MAX_POINTS = 100;
		Person person = null;
		StoryType storyType = null;
		String storyPitchStatusLevel = "pending-level1-approval";
		
		// validate the form has all fields
		if(storyPitch == null ||
				!(validatePitchHasAllFields(storyPitch))) {
			log.debug("Form was missing fields");
			return null;
		}
		
		// validate the user is an author 
		Integer authorId = storyPitch.getAuthorId();
		if(validateUserIsAuthor(authorId)){
			person = this.getPersonById(authorId);
		}else {
			log.info("User is not an author. Only authors can submit.");
			return null;
		}
		
		// Get and set the type we'll need this later to check the author's points and such
		// type will be set by pagecount
		log.info("USER STORY: Story types are pulled form a reference table");
		storyType = getStoryTypeByPageCount(storyPitch.getPageCount());
		
		// Now we can set the story's type and Priority!
		storyPitch.setType(storyType);
		storyPitch.setPriority("NORMAL");
		//storyPitchStatusLevel = "";
		
//		 Now we need to check how many points the author has 
//		 and ask, can the author "afford" to submit this story?
//		 If 'Yes' the status will become 
//		   pending-level1-approval
//		 if 'No' the status will become 
//		   on-hold
		Integer authorPointsBudget = MAX_POINTS - person.getPointsInQueue(); 
		Integer storyCost = storyPitch.getType().getWeightedValue();
		if(authorPointsBudget >= storyCost) {
			storyPitch.setStatus(storyPitchStatusLevel);
			addStoryPoints(person, storyCost);
		}else {
			storyPitch.setStatus("on-hold");
		}
		
		//System.out.println(storyPitch.toString());
		//System.out.println(person.toString());
		// Now we need to update the DB
		// Since we want to make sure both go through
		// 1) Add the Storypitch 
		storyPitchDao.addStoryPitch(storyPitch);
		
		// 2) Update the author's points
		// There's a risk here that addpitch will fail, 
		// but there's no easy way to test for this
		personDao.updatePerson(person);
		return storyPitch;
	}
	

	
	/**
	 * This will show the author a list of all their stories 
	 * by status 
	 * @param storyPitch
	 * @return
	 */
	public List<StoryPitch> getStoryPitches(Integer authorId, String status){
		log.trace("Retrieving story pitches by author and status");
		log.info("USER STORY: Author can resubmit stories on hold,"
				+ "\n this lets us get 'on hold' stories for the user" );
		
		log.trace("Checking for null values");
		if(status == null || authorId == null) {
			log.debug("Null value detected, returning null");
			return null;
		}
		
		boolean goodStatus = this.validateStoryPitchStatus(status);
		if(goodStatus) {
			return storyPitchDao.readStoryPitch(authorId, status);
		}
		return null;
	}
	
	/**
	 * This is used to get story pitches by status priority and genre.
	 * This will return all story pitches by priority 
	 * At a higher level we can choose to get story pitches only by a
	 * a specific priority :)
	 * @param authorId
	 * @param status
	 * @param genre
	 * @return
	 */
	public List<StoryPitch> getStoryPitches(
			 String status, String priority, String genre){
		log.trace("Retrieving story pitches by author,status, and genre");
		log.info("USER STORY: This will let editors see store pitches "
				+ " in their genre that need approval");
		
		log.trace("Checking for null values");
		if(status == null || priority == null || genre == null) {
			log.debug("Null value detected, returning null");
			return null;
		}
		
		boolean goodStatus = this.validateStoryPitchStatus(status);
		
		if(goodStatus) {
			return storyPitchDao.readStoryPitch(status, priority, genre);
		}
		return null;
	}
	
	
	public void approvePitch(Integer storyPitchId) {
		
	}
	
	/**
	 * Reject pitch automatically applies a reason 
	 * as it updates the status to reject - whatever
	 * @param entity
	 * @return
	 */
	public StoryPitch rejectPitch(StoryPitch entity) {
		return null;
	}
	
	public StoryDraft submitDraft(StoryDraft entity) {
		return null;
	}
	
	public StoryDraft approveDraft(StoryDraft entity) {
		return null;
	}
	
	public StoryDraft requestChangesToDraft(StoryDraft entity) {
		return null;
	}

	/**
	 * The total points the author has in queue 
	 * @param person_id
	 * @return
	 */
	public Integer getPoints(Integer person_id) {
		Person p = personDao.readPersonById(person_id);
		return p.getPointsInQueue();
	}
	
	
	/**
	 * This one should be used with care
	 * @param person
	 * @return
	 * @throws Exception 
	 */
	public Integer subtractStoryPoints(Person person, Integer pointsToSubtract) throws Exception {
		throw new Exception(); // this has not been implemented yet 
		//return getPoints(person.getPointsInQueue());
	}
	
	/**
	 * Adds points to a cumulative total
	 * Returns the new value of points
	 * @param personId
	 * @param pointsToAdd
	 * @return
	 */
	public Integer addStoryPoints(Person person, Integer pointsToAdd) {
		log.trace("Adding points to user's working points queue");
		Integer pointsInQueue = person.getPointsInQueue();
		person.setPointsInQueue(pointsInQueue + pointsToAdd);
		return person.getPointsInQueue();
	}
	
	public boolean validateStoryPitchStatus(String status) {
		boolean goodStatus = false;
		if(status == null) {
			return false;
		}
		
		for(StoryPitchStatus spud : storyPitchStausDao.getAllStoryPitchStatuses()) {
			if(status.equals(spud.getStatus())) {
				goodStatus = true;
			}
		}
		return goodStatus;
	}
}
