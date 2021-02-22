package com.revature.data;

import java.util.List;

public interface PersonDao<T> {
	public  T submitNewPitch(T entity);
	
	public  T submitPitchOnHold(T entity);
	
	public List<T> getPitchesOnHold(T entity);
	
	public T approvePitch(T entity);
	
	/**
	 * Deny pitch automatically applies a reason 
	 * as it updates the status to reject - whatever
	 * @param entity
	 * @return
	 */
	public T denyPitch(T entity);
	
	public T submitDraft(T entity);
	
	public T approveDraft(T entity);
	
	public T requestChangesToDraft(T entity);
}
