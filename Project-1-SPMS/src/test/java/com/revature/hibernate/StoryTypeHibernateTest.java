package com.revature.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.data.DaoFactory;
import com.revature.data.StoryTypeDao;
import com.revature.models.StoryType;

class StoryTypeHibernateTest {

	private StoryType st ;
	
	@BeforeEach
	void setup() {
		st = new StoryType();
	}
	
	@Test
	void testStoryTypeHibernate() {
		assertNotNull(st);
	}

	@Test
	void testGetStoryTypeByPointsNullValue() {
		StoryTypeDao std = DaoFactory.getStoryTypeDao();
		assertNull(std.getStoryTypeByPoints(null));
	}
	
	@Test
	void testGetStoryTypeByPointsBadValue() {
		StoryTypeDao std = DaoFactory.getStoryTypeDao();
		assertTrue(std.getStoryTypeByPoints(-1).isEmpty());
	}
	
	@Test
	void testGetStoryTypeByPointsGoodValue() {
		StoryTypeDao std = DaoFactory.getStoryTypeDao();
		assertTrue(std.getStoryTypeByPoints(10).size() == 1);
	}
	
	@Test
	void testGetAllStoryTypes() {
		StoryTypeDao std = DaoFactory.getStoryTypeDao();
		std.getAllStoryTypes().forEach(story->System.out.println(story.toString()));
	}
	
	
}
