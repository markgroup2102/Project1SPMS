package com.revature.data;

import java.util.List;

import com.revature.models.StoryApprovalHistory;

public interface StoryApprovalHistoryDao {
	public StoryApprovalHistory addStoryApprovalHistory(StoryApprovalHistory sah);
	
	public List<StoryApprovalHistory> getStoryApprovalHistoryByStoryId(Integer story_id);

}
