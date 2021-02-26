package com.revature.hibernate;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.data.StoryPitchDao;
import com.revature.models.StoryApprovalHistory;
import com.revature.models.StoryPitch;
import com.revature.utilities.HibernateUtil;

public class StoryPitchHibernate implements StoryPitchDao {
	private static Logger log = Logger.getLogger(StoryPitchHibernate.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	
	public StoryPitchHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStoryPitch(StoryPitch storyPitch) {
		log.trace("Adding new story pitch");
		Session sesh = hu.getSession();
		sesh.save(storyPitch);
		sesh.close();
	}

	@Override
	public void updateStoryPitch(StoryPitch storyPitch) {
		log.trace("Updating story submission");
		Session s = hu.getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.update(storyPitch);
			trx.commit();
		}catch (Exception e) {
			if(trx != null) {
				trx.rollback();
			}
		}finally {
			s.close();
		}
	}

	@Override
	public StoryPitch readStoryPitch(StoryPitch storyPitch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoryPitch> readStoryPitchByGenre(String genre) {
		log.trace("Returning story pitches by genre");
		Session s = hu.getSession();
		String query = "FROM StoryPitch WHERE genre = " +genre;
		Query<StoryPitch> q = s.createQuery(query, StoryPitch.class);
		List<StoryPitch> StoryPitch = q.getResultList();
		s.close();
		return StoryPitch;
	}

}
