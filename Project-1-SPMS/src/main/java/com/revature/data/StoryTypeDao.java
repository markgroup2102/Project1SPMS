package com.revature.data;

import java.util.List;

import com.revature.models.StoryType;

public interface StoryTypeDao {
	public List<StoryType> getStoryTypeByPoints(Integer pointValue);
	
	public List<StoryType> getAllStoryTypes();
}
