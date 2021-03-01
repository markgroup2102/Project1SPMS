package com.revature.data;

import java.util.List;

import com.revature.models.StoryPitch;

public interface StoryPitchDao {
	public void addStoryPitch(StoryPitch storyPitch);
	
	public void updateStoryPitch(StoryPitch storyPitch);
	
	public StoryPitch readStoryPitch(StoryPitch storyPitch);
	
	public List<StoryPitch> readStoryPitchByGenre(String genre);

	public List<StoryPitch> readStoryPitchByStatus(String status);
	
	public List<StoryPitch> readStoryPitch(Integer authorId, String status);
	
	public List<StoryPitch> readStoryPitch(String status, String priority, String genre);
}
