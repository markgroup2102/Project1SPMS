package com.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.data.DaoFactory;
import com.revature.data.StoryArtifactDao;
import com.revature.models.StoryArtifact;

class StoryArtifactServiceTest {
	private StoryArtifactDao sad = DaoFactory.getStoryArtifactDao();

	@Test
	void testAddStoryArtifact() {
		StoryArtifact sart = new StoryArtifact();
		sart.setLink("http://example.com");
		sart.setStoryId(8);
		assertNotNull(sad.addStoryArtifact(sart));
	}

	@Test
	void testGetStoryArtifactsByStoryId() {
		assertNotNull(sad.readStoryArtifacts(8));
	}
	

}
