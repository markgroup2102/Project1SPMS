package com.revature.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.data.DaoFactory;
import com.revature.data.StoryPitchDao;
import com.revature.models.StoryPitch;

class StoryPitchHibernateTest {

	@Test
	void testReadStoryPitchStatusGenre() {
		StoryPitchDao spud = DaoFactory.getStoryPitchDao();
		List<StoryPitch> list = spud.readStoryPitch("pending-level1-approval","NORMAL", "FAN-FICTION");
		System.out.println(list.toString());
		assertNotNull(list);
	}

}
