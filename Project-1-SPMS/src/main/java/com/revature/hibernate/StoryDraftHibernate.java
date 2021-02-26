package com.revature.hibernate;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.data.StoryDraftDao;
import com.revature.models.StoryDraft;
import com.revature.utilities.HibernateUtil;

public class StoryDraftHibernate implements StoryDraftDao {
	private static Logger log = Logger.getLogger(StoryDraftHibernate.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	
	public StoryDraftHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public StoryDraft addStoryDraft(StoryDraft storyDraft) {
		log.trace("Submitting story draft");
		Session s = hu.getSession();
		s.save(storyDraft);
		s.close();
		return null;
	}

	@Override
	public void updateStoryDraft(StoryDraft storyDraft) {
		log.trace("Updating draft submission");
		Session s = hu.getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.update(storyDraft);
			trx.commit();
		}catch (Exception e) {
			if(trx != null) {
				trx.rollback();
			}
		}finally {
			s.close();
		}
	}
}
