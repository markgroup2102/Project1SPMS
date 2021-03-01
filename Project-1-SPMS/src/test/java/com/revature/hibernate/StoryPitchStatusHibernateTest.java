package com.revature.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.data.DaoFactory;
import com.revature.data.StoryPitchStatusDao;

class StoryPitchStatusHibernateTest {

	@Test
	void testGetAllStoryPitchStatuses() {
		StoryPitchStatusDao spud = DaoFactory.getStoryPitchStatusDao();
		assertNotNull(spud.getAllStoryPitchStatuses().toString());
	}

}
