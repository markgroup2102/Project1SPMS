package com.revature.services;

import org.apache.log4j.Logger;

import com.revature.data.AdditionalDetailRequestDao;
import com.revature.data.DaoFactory;
import com.revature.models.AdditionalDetailsMessage;

public class MessageService {
	private Logger log = Logger.getLogger(MessageService.class.getName());
	private AdditionalDetailRequestDao admdao = DaoFactory.getAdditionalDetailRequestDao();
	
	public MessageService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * All fields should auto populate except for message 
	 * @param adm
	 * @return
	 */
	public Integer sendNewAdditionalDetailRequest(AdditionalDetailsMessage adm) {
		log.info("USER STORY: Sending a request for more information on a book" );
		if(adm == null) {
			log.debug("Null value detected, returning null.");
			return null;
		}
		return (Integer) admdao.createAdditionalDetailsMessage(adm);
		
	}
	
	
	public AdditionalDetailsMessage getAdditionalDetailRequest(Integer storyId) {
		if(storyId == null) {
			return null;
		}
		
		return admdao.readAdditionalDetailsMessageByStory(storyId);
	}
	
	/**
	 * This should be used when a user replies to another user's message
	 * @param entity
	 * @return
	 */
	public AdditionalDetailsMessage replyToAdditionalDetailRequest(AdditionalDetailsMessage entity) {
		return entity;
	}

}
