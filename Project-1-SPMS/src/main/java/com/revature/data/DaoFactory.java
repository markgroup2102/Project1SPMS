package com.revature.data;

import com.revature.hibernate.AdditionalDetailsRequestHibernate;
import com.revature.hibernate.PersonHibernate;
import com.revature.hibernate.StoryApprovalHistoryHibernate;
import com.revature.hibernate.StoryArtifactHibernate;
import com.revature.hibernate.StoryDraftHibernate;
import com.revature.hibernate.StoryPitchHibernate;
import com.revature.hibernate.StoryTypeHibernate;

public class DaoFactory {

	private DaoFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static AdditionalDetailRequestDao getAdditionalDetailRequestDao() {
		return new AdditionalDetailsRequestHibernate();
	}
	
	public static PersonDao getPersonDao() {
		return new PersonHibernate();
	}
	
	public static StoryApprovalHistoryDao getStoryApprovalHistoryDao() {
		return new StoryApprovalHistoryHibernate();
	}
	
	public static StoryArtifactDao getStoryArtifactDao() {
		return new StoryArtifactHibernate();
	}
	
	public static StoryDraftDao getStoryDraftHDao() {
		return new StoryDraftHibernate();
	}
	
	public static StoryPitchDao getStoryPitchDao() {
		return new StoryPitchHibernate();
	}
	
	public static StoryTypeDao getStoryTypeDao() {
		return new StoryTypeHibernate();
	}
}
