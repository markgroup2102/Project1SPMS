package com.revature.services;

import java.util.List;

import com.revature.hibernate.StoryDraft;

public class StoryDraftService {

	public StoryDraftService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This should be used to get drafts by a genre 
	 * @param entity
	 * @return
	 */
	public StoryDraft getDraftsByGenre(StoryDraft entity) {
		return null;
	}
	
	/**
	 * THis should be used to get all the drafts by a spefic user 
	 * @param entity
	 * @return
	 */
	public StoryDraft getDraftsByUserId(StoryDraft entity) {
		return null;
	}
	
	public List<StoryDraft> getDraftsByType(StoryDraft entity) {
		return null;
	}
	
	public List<StoryDraft> getDraftsByStoryId(StoryDraft entity) {
		return null;
	}
	
	/**
	 * This will be used when any editor requests changes 
	 * they will edit the draft in the link
	 * and hit some sort of request revision, 
	 * this will change the draft status to "changes requested"
	 * @param entity
	 * @return
	 */
	public StoryDraft updateDraft(StoryDraft entity) {
		return null;
	}

}
