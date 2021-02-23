package com.revature.data;

import java.util.List;

import com.revature.hibernate.StoryArtifact;

public interface StoryArtifactDao {
	public StoryArtifact addStoryArtifact(StoryArtifact storyArtifact);
	
	public List<StoryArtifact> readStoryArtifacts(StoryArtifact storyArtifact);
}
