package com.revature.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.data.DaoFactory;
import com.revature.data.StoryApprovalHistoryDao;
import com.revature.models.StoryApprovalHistory;
import com.revature.models.StoryPitch;

public class StoryApprovalHistoryService {
	private static Logger log = Logger.getLogger(StoryApprovalHistoryService.class.getName());
	private StoryApprovalHistoryDao storyApprovalHistoryDao = DaoFactory.getStoryApprovalHistoryDao();
	public StoryApprovalHistoryService() {
		
	}
	
	public StoryApprovalHistory addEntryStoryApprovalHistory(StoryApprovalHistory sah) {
		if(sah == null ) {
			return null;
		}
		
		return storyApprovalHistoryDao.addStoryApprovalHistory(sah);
	}
	
	public List<StoryApprovalHistory> getEntriesByStoryId(StoryPitch storyPitch) {
		return null;
	}

}
