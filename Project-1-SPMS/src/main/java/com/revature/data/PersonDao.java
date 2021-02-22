package com.revature.data;

import java.util.List;

import com.revature.hibernate.StoryDraft;
import com.revature.hibernate.StoryPitch;

public interface PersonDao {
	public  StoryPitch submitNewPitch(StoryPitch entity);
	
	public  StoryPitch submitPitchOnHold(StoryPitch entity);
	
	public List<StoryPitch> getPitchesOnHold(StoryPitch entity);
	
	public StoryPitch approvePitch(StoryPitch entity);
	
	/**
	 * Deny pitch automatically applies a reason 
	 * as it updates the status to reject - whatever
	 * @param entity
	 * @return
	 */
	public StoryPitch denyPitch(StoryPitch entity);
	
	public StoryDraft submitDraft(StoryDraft entity);
	
	public StoryDraft approveDraft(StoryDraft entity);
	
	public StoryDraft requestChangesToDraft(StoryDraft entity);
}
