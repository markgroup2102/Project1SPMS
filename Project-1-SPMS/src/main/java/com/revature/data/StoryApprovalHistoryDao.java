package com.revature.data;

import java.util.List;

import com.revature.hibernate.StoryApprovalHistory;

public interface StoryApprovalHistoryDao {
	public StoryApprovalHistory addStoryApprovalHistory(StoryApprovalHistory sah);
	
	public List<StoryApprovalHistory> getStoryApprovalHistory(StoryApprovalHistory sah);

}
