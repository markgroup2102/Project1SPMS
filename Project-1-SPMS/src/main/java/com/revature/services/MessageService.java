package com.revature.services;

import com.revature.models.AdditionalDetailsMessage;

public class MessageService {

	public MessageService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * All fields should auto populate except for message 
	 * @param adm
	 * @return
	 */
	public AdditionalDetailsMessage sendNewAdditionalDetailRequest(AdditionalDetailsMessage adm) {
		return adm;
	}
	
	
	public AdditionalDetailsMessage getAdditionalDetailRequest(AdditionalDetailsMessage entity) {
		return entity;
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
