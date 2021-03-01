package com.revature.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.models.StoryPitchStatus;
import com.revature.models.StoryType;
import com.revature.utilities.HibernateUtil;

public class StoryPitchStatusHibernate implements com.revature.data.StoryPitchStatusDao {
	private static Logger log = Logger.getLogger(StoryPitchStatusHibernate.class.getName());
	
	public StoryPitchStatusHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<StoryPitchStatus> getAllStoryPitchStatuses() {
		
		log.trace("Getting all story pitch status codes");
		Session s = HibernateUtil.getHibernateUtil().getSession();
		//String query = ("FROM StoryPitchStatus s");
		//Query<StoryPitchStatus> q = s.createQuery("FROM StoryPitchStatus",StoryPitchStatus.class);
		//return q.getResultList();
		//*/
		CriteriaBuilder cb = s.getCriteriaBuilder();
	    CriteriaQuery<StoryPitchStatus> cq = cb.createQuery(StoryPitchStatus.class);
	    Root<StoryPitchStatus> rootEntry = cq.from(StoryPitchStatus.class);
	    CriteriaQuery<StoryPitchStatus> all = cq.select(rootEntry);

	    Query<StoryPitchStatus> allQuery = s.createQuery(all);
	    return allQuery.getResultList();
	}

}
