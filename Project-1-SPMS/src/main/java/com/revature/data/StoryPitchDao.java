package com.revature.data;

import java.util.List;

import com.revature.models.StoryPitch;

public interface StoryPitchDao {
	public StoryPitch addStoryPitch(StoryPitch storyPitch);
	
	public StoryPitch updateStoryPitch(StoryPitch storyPitch);
	
	public StoryPitch readStoryPitch(StoryPitch storyPitch);
}
