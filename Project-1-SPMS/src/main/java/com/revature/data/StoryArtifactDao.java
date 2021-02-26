package com.revature.data;

import java.util.List;

import com.revature.models.StoryArtifact;

public interface StoryArtifactDao {
	public void addStoryArtifact(StoryArtifact storyArtifact);
	
	public List<StoryArtifact> readStoryArtifacts(Integer id);
}
