package com.revature.hibernate;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.data.StoryApprovalHistoryDao;
import com.revature.models.StoryApprovalHistory;
import com.revature.utilities.HibernateUtil;

public class StoryApprovalHistoryHibernate implements StoryApprovalHistoryDao{
	private static Logger log = Logger.getLogger(StoryApprovalHistoryHibernate.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	public StoryApprovalHistoryHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStoryApprovalHistory(StoryApprovalHistory sah) {
		log.trace("Adding story approval history ");
		Session s = hu.getSession();
		s.save(sah);
		s.close();
	}

	@Override
	public List<StoryApprovalHistory> getStoryApprovalHistoryByStoryId(Integer story_id) {
		log.trace("Returning the history of approval by story id");
		Session s = hu.getSession();
		String query = "FROM StoryApprovalHistory WHERE story_id = " +story_id;
		Query<StoryApprovalHistory> q = s.createQuery(query, StoryApprovalHistory.class);
		List<StoryApprovalHistory> storyHistory = q.getResultList();
		s.close();
		return storyHistory;
	}

}
