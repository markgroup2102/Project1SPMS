package com.revature.hibernate;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.data.AdditionalDetailRequestDao;
import com.revature.models.AdditionalDetailsMessage;
import com.revature.utilities.HibernateUtil;

public class AdditionalDetailsRequestHibernate implements AdditionalDetailRequestDao {

	private static Logger log = Logger.getLogger(AdditionalDetailsRequestHibernate.class.getName());
	
	public AdditionalDetailsRequestHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable createAdditionalDetailsMessage(AdditionalDetailsMessage adm) {
		log.trace("Creating a new message request ");
		Session s =  HibernateUtil.getHibernateUtil().getSession();
		Serializable messageId = s.save(adm);
		s.close();
		return messageId;
		
	}

	@Override
	public void updateAdditionalDetailsMessage(AdditionalDetailsMessage adm) {
		log.trace("Updating message details ");
		Session s =  HibernateUtil.getHibernateUtil().getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.update(adm);
			trx.commit();
		}catch(Exception e) {
			if(trx!=null) {
				trx.rollback();
			}
		}
	}

	@Override
	public AdditionalDetailsMessage readAdditionalDetailsMessageByStory(Integer storyId) {
		log.trace("Reading detail message request");
		Session s = HibernateUtil.getHibernateUtil().getSession();
		AdditionalDetailsMessage adm = s.get(AdditionalDetailsMessage.class, storyId);
		s.close();
		return adm;
	}

}
