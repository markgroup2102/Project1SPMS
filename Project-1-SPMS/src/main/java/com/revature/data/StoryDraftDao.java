package com.revature.data;

import java.util.List;

public interface StoryDraftDao<T> {
	
	/**
	 * This should be used to get drafts by a genre 
	 * @param entity
	 * @return
	 */
	public T getDraftsByGenre(T entity);
	
	/**
	 * THis should be used to get all the drafts by a spefic user 
	 * @param entity
	 * @return
	 */
	public T getDraftsByUserId(T entity);
	
	public List<T> getDraftsByType(T entity);
	
	public List<T> getDraftsByStoryId(T entity);
	
	/**
	 * This will be used when any editor requests changes 
	 * they will edit the draft in the link
	 * and hit some sort of request revision, 
	 * this will change the draft status to "changes requested"
	 * @param entity
	 * @return
	 */
	public T updateDraft(T entity);
	
	
	
	
}
