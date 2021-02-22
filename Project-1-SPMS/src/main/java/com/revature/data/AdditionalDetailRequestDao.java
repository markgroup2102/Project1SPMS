package com.revature.data;

public interface AdditionalDetailRequestDao<T> {
	public T sendAdditionalDetailRequest(T entity);
	
	/**
	 * This should work by story id 
	 * Like when an author views their story pitch
	 * it should show a box with a message
	 * @param entity
	 * @return
	 */
	public T getAdditionalDetailRequest(T entity);
}
