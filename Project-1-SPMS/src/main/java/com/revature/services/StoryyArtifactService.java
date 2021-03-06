package com.revature.services;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.data.DaoFactory;
import com.revature.data.StoryArtifactDao;
import com.revature.models.StoryArtifact;
import com.revature.utilities.HibernateUtil;

public class StoryyArtifactService {

	private static Logger log = Logger.getLogger(StoryyArtifactService.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	
	
	public StoryyArtifactService() {
		// TODO Auto-generated constructor stub
	}

	public Serializable addStoryArtifact(StoryArtifact storyArtifact) {
		if(storyArtifact == null) {
			return null;
		}
		StoryArtifactDao sad = DaoFactory.getStoryArtifactDao();
		 return sad.addStoryArtifact(storyArtifact);
		  
	}
	
	public List<StoryArtifact> getStoryArtifactsByStoryId(Integer storyId) {
		StoryArtifactDao sad = DaoFactory.getStoryArtifactDao();
		return sad.readStoryArtifacts(storyId);
	}	
}
