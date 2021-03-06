package com.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.revature.models.StoryApprovalHistory;

class StoryApprovalHistoryServiceTest {


	@Test
	void testAddEntryStoryApprovalHistory() {
		StoryApprovalHistory sah = new StoryApprovalHistory();
		sah.setApproverId(null); // comes from user who approved /jected it 
		sah.setId(null); // auto generated 
		sah.setLocalDate(LocalDate.now()); // today's date 
		sah.setStatus(null); // the way it was changed 
		sah.setStoryId(null); // the id it corropsonds to 
		fail("Not yet implemented");
	}

	@Test
	void testGetEntriesByStoryId() {
		fail("Not yet implemented");
	}

}
