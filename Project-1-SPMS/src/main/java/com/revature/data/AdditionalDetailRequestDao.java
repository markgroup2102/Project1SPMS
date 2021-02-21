package com.revature.data;

public interface AdditionalDetailRequestDao<T> {
	public T sendAdditionalDetailRequest(T entity);
	
	public T getAdditionalDetailRequest(T entity);
}
