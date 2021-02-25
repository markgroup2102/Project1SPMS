package com.revature.services;

import java.util.List;

import com.revature.models.StoryPitch;

public class StoryPitchService {

	public StoryPitchService() {
		// TODO Auto-generated constructor stub
	}
	public  StoryPitch createPitch( StoryPitch entity) {
		return null;
	}
	
	/**
	 * What we can do here is "Update pitch where id = x;"
	 * Thus we can pass in any pitch with an updated value 
	 * like status or priority 
	 * @param <T> an entity of type T this should be a pitch
	 * @param entity a pitch
	 * @return
	 */
	public  StoryPitch updatePitch( StoryPitch entity) {
		return null;
	}
	
	public  StoryPitch getPitchById(StoryPitch entity){
		return entity;
		
	}
	
	/**
	 * Potentially this would be where status = something 
	 * like an assistnat manager would set their status to pending
	 * @param entity
	 * @return
	 */
	public List< StoryPitch> getPitchByGenre( StoryPitch entity) {
		return null;
	}
}
