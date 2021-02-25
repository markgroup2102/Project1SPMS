package com.revature.services;

import java.util.List;

import com.revature.models.Person;
import com.revature.models.StoryDraft;
import com.revature.models.StoryPitch;

public class PersonService {

	public PersonService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * We should check their id in the controller/delegate level 
	 * @param person
	 * @return
	 */
	public Person getPersonById(Person person) {
		return person;
	}
	
	public StoryPitch submitStoryPitch(StoryPitch storyPitch) {
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
