package com.revature.data;

import java.util.List;

public interface StoryApprovalHistoryDao<T> {
	public T createEntry(T entity);
	
	public List<T> getEntriesByStoryId(T entity);
}
