package com.revature.data;

import java.util.List;

import com.revature.hibernate.Person;
import com.revature.hibernate.StoryDraft;
import com.revature.hibernate.StoryPitch;

/**
 * This adds CRUD methodology to the people table 
 * @author mwhis
 *
 */
public interface PersonDao {
	/**
	 * Adds a person to the people table
	 * @param person
	 * @return
	 */
	public Person addPerson(Person person);
	
	/**
	 * Updates a person in the people table 
	 * This will be used mostly to update their current points
	 * @param person
	 * @return
	 */
	public Person updatePerson(Person person);
	
	/**
	 * Read a person from the table into memory 
	 * @param person
	 * @return
	 */
	public Person readPerson(Person person);
	
	/**
	 * Not Implemented yet
	 * Will be used to remove people from the database
	 * @param person
	 * @return
	 */
	public Person removePerson(Person person);
	
	
	
}
