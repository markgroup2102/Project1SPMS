package com.revature.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.data.DaoFactory;
import com.revature.data.PersonDao;
import com.revature.models.Person;
import com.revature.models.StoryDraft;
import com.revature.models.StoryPitch;

public class PersonService {
	private static Logger log = Logger.getLogger(PersonService.class.getName());
	
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
		PersonDao pd = DaoFactory.getPersonDao();
		return pd.readPersonById(id);
	}
	
	/**
	 * Submits a story pitch 
	 * Some parameters will be calculated here
	 * such as priority, 
	 * @param storyPitch
	 * @return
	 */
	public StoryPitch submitStoryPitch(StoryPitch storyPitch) {
		// What needs to happen here? 
		// SO we need to see how many points the author has 
		//  Does the author have enough points to subit a story? 
		return storyPitch;
	}
	
	/**
	 * Here we can change what we want by changing the status 
	 * in story pitch 
	 * Example 
	 * 	Author view queue status != rejected 
	 *  Author view on hold status = 
	 * @param storyPitch
	 * @return
	 */
	public List<StoryPitch> getStoryPitches(StoryPitch storyPitch){
		// what if we tried to do something like 
		return null;
		
	}
	
	public  StoryPitch submitNewPitch(StoryPitch entity) {
		return null;
	}
	
	public  StoryPitch submitPitchOnHold(StoryPitch entity) {
		return null;
	}
	
	public List<StoryPitch> getPitchesOnHold(StoryPitch entity) {
		return null;
	}
	
	public StoryPitch approvePitch(StoryPitch entity) {
		return null;
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

	public Person getPoints(Person person) {
		return person;
		
	}
	
	public void updatePersonPointTotal(Person person) {
		
	}
}
