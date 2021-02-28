package com.revature.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.data.StoryTypeDao;
import com.revature.models.StoryType;
import com.revature.utilities.HibernateUtil;

public class StoryTypeHibernate implements StoryTypeDao {
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	private static Logger log = Logger.getLogger(StoryTypeHibernate.class.getName());

	public StoryTypeHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<StoryType> getStoryTypeByPoints(Integer pointValue) {
		log.trace("Getting story type by point value");
		if(pointValue == null) {
			log.debug("Null value detected, returning null value");
			return null;
		}
		
		Session s = hu.getSession();
		String query = ("FROM StoryType WHERE weightedValue = " + pointValue );
		Query<StoryType> q = s.createQuery(query,StoryType.class);
		return q.getResultList();
	}

	@Override
	public List<StoryType> getAllStoryTypes() {
		log.trace("Getting all story types");
		Session s = hu.getSession();
		String query = ("FROM StoryType ORDER BY weightedValue");
		Query<StoryType> q = s.createQuery(query,StoryType.class);
		return q.getResultList();
	}
}
