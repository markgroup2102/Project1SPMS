package com.revature.data;

import java.util.List;

import com.revature.hibernate.StoryDraft;
import com.revature.hibernate.StoryPitch;

public class PersonPostgres implements PersonDao {

	public PersonPostgres() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public StoryPitch submitNewPitch(StoryPitch entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryPitch submitPitchOnHold(StoryPitch entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoryPitch> getPitchesOnHold(StoryPitch entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryPitch approvePitch(StoryPitch entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryPitch denyPitch(StoryPitch entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryDraft submitDraft(StoryDraft entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryDraft approveDraft(StoryDraft entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoryDraft requestChangesToDraft(StoryDraft entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
