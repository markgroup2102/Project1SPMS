package com.revature.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.data.PersonDao;
import com.revature.models.Person;
import com.revature.models.StoryDraft;
import com.revature.models.StoryPitch;
import com.revature.utilities.HibernateUtil;

/**
 * A postgresSQL implementation of PersonDao
 * @author mwhis
 *
 */
public class PersonHibernate implements PersonDao {
	private static Logger log = Logger.getLogger(PersonHibernate.class.getName());
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();
	
	public PersonHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPerson(Person person) {
		log.trace("Adding person to database ");
		Session s = hu.getSession();
		Serializable serial = s.save(person);
		s.close();
	}

	@Override
	/**
	 * Care should be taken when using this method to only update specific fields
	 */
	public void updatePerson(Person person) {
		log.trace("Updating person");
		Session s  = hu.getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.saveOrUpdate(person);
			trx.commit();
		}catch (Exception e) {
			
		}finally {
			s.close();
		}
	}

	@Override
	public Person readPersonById(Person person) {
		log.trace("Reading person by id: "+ person.getId());
		Session s = hu.getSession();
		person = s.get(Person.class, person.getId());
		s.close();
		return person;
	}

	@Override
	/**
	 * For safety reasons this method is not functional
	 */
	public Person removePerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
