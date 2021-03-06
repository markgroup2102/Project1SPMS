package com.revature.data;

import java.io.Serializable;

import com.revature.models.AdditionalDetailsMessage;

public interface AdditionalDetailRequestDao {
	
	/**
	 * This will create a new request for additonal details 
	 * @param adm
	 * @return
	 */
	public Serializable createAdditionalDetailsMessage(
			AdditionalDetailsMessage adm);
	
	/**
	 * When a person replies to an ADM it will append/ prepend their message 
	 * This will keep a detailed record of the conversation 
	 * @param adm
	 * @return
	 */
	public void updateAdditionalDetailsMessage(
			AdditionalDetailsMessage adm);
	
	/**
	 * This will this will use the story id from the adm to read the most
	 * current version
	 * @param storyId TODO
	 * @return
	 */
	public AdditionalDetailsMessage readAdditionalDetailsMessageByStory(
			Integer storyId);
	
}
