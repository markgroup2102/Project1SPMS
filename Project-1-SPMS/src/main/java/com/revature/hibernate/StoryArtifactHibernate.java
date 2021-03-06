package com.revature.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.query.Query;
import org.hibernate.Session;

import com.revature.data.StoryArtifactDao;
import com.revature.models.StoryArtifact;
import com.revature.utilities.HibernateUtil;

public class StoryArtifactHibernate implements StoryArtifactDao {
	private static Logger log = Logger.getLogger(StoryArtifactHibernate.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	
	public StoryArtifactHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable addStoryArtifact(StoryArtifact storyArtifact) {
		log.trace("Adding story artifact");
		Session s = hu.getSession();
		Serializable fact =  s.save(storyArtifact);
		s.close();
		return fact;
	}

	@Override
	public List<StoryArtifact> readStoryArtifacts(Integer id) {
		log.trace("Reading atifacts by story id");
		Session s = hu.getSession();
		String hql = ("FROM StoryArtifact WHERE id = " + id);
		Query<StoryArtifact> query = s.createQuery(hql, StoryArtifact.class);
		return query.getResultList();
	}

}
