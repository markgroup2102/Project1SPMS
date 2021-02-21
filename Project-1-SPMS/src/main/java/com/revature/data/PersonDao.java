package com.revature.data;

import java.util.List;

public interface PersonDao<T> {
	public  T submitNewPitch(T entity);
	
	public  T submitPitchOnHold(T entity);
	
	public List<T> getPitchesOnHold(T entity);
	
	public List<T> getStoryDrafts(T entity);
	
	public T approvePitch(T entity);
	
	public T denyPitch(T entity);
	
}
