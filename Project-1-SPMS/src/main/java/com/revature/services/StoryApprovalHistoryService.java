package com.revature.services;

import java.util.List;

import com.revature.hibernate.StoryApprovalHistory;
import com.revature.hibernate.StoryPitch;

public class StoryApprovalHistoryService {

	public StoryApprovalHistoryService() {
		
	}
	
	public StoryApprovalHistory addEntryStoryApprovalHistory(StoryApprovalHistory sah) {
		return sah;

	}
	
	public List<StoryApprovalHistory> getEntriesByStoryId(StoryPitch storyPitch) {
		return null;
	}

}
