package com.revature.data;

import java.util.List;

public interface StoryPitchDao<T> {
	
	public T createPitch(T entity);
	
	/**
	 * What we can do here is "Update pitch where id = x;"
	 * Thus we can pass in any pitch with an updated value 
	 * like status or priority 
	 * @param <T> an entity of type T this should be a pitch
	 * @param entity a pitch
	 * @return
	 */
	public T updatePitch(T entity);
	
	public T getPitchById(T entity);
	
	/**
	 * Potentially this would be where status = something 
	 * like an assistnat manager would set their status to pending
	 * @param entity
	 * @return
	 */
	public List<T> getPitchByGenre(T entity);
}
