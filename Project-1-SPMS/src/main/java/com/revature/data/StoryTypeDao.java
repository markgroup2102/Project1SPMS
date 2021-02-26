package com.revature.data;

import com.revature.models.StoryType;

public interface StoryTypeDao {
	public StoryType getStoryTypeByPoints(Integer pointValue);
}
