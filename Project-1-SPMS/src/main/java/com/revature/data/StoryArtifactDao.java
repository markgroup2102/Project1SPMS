package com.revature.data;

import java.io.Serializable;
import java.util.List;

import com.revature.models.StoryArtifact;

public interface StoryArtifactDao {
	public Serializable addStoryArtifact(StoryArtifact storyArtifact);
	
	public List<StoryArtifact> readStoryArtifacts(Integer id);
}
