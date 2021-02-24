package com.revature.data;

import com.revature.hibernate.AdditionalDetailsMessage;

public interface AdditionalDetailRequestDao {
	
	/**
	 * This will create a new request for additonal details 
	 * @param adm
	 * @return
	 */
	public AdditionalDetailsMessage createAdditionalDetailsMessage(
			AdditionalDetailsMessage adm);
	
	/**
	 * When a person replies to an ADM it will append/ prepend their message 
	 * This will keep a detailed record of the conversation 
	 * @param adm
	 * @return
	 */
	public AdditionalDetailsMessage updateAdditionalDetailsMessage(
			AdditionalDetailsMessage adm);
	
	/**
	 * This will this will use the story id from the adm to read the most
	 * current version
	 * @param adm
	 * @return
	 */
	public AdditionalDetailsMessage readAdditionalDetailsMessage(
			AdditionalDetailsMessage adm);
	
}
