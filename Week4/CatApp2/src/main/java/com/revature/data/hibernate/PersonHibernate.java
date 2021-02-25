package com.revature.data.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.beans.Person;
import com.revature.data.PersonDAO;
import com.revature.exceptions.NonUniqueUsernameException;
import com.revature.utils.HibernateUtil;

public class PersonHibernate implements PersonDAO {
	
	@Override
	public Person getById(Integer id) {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Person p = s.get(Person.class, id);
		s.close();
		return p;
	}

	@Override
	public Set<Person> getAll() {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		String query = ("FROM Cat");
		Query<Person> q = s.createQuery(query,Person.class);
		List<Person> l = q.getResultList();
		Set<Person> p = new HashSet<>();
		p.addAll(l);
		s.close();
		return p;
	}

	@Override
	public void update(Person t) {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.update(t);
			trx.commit();
		}catch(Exception e) {
			if(trx != null) {
				trx.rollback();
			}
		}finally{
			s.close();
		}
	}

	@Override
	public void delete(Person t) {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.delete(t);
			trx.commit();
		}catch (Exception e) {
			if(trx != null) {
				trx.rollback();
			}
		}finally {
			s.close();
		}
	}

	@Override
	public Person add(Person p) throws NonUniqueUsernameException {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.save(p);
			trx.commit();
		}catch(Exception e) {
			if(trx!=null) {
				trx.rollback();
			}
		}finally {
			s.close();
		}
		return p;
	}

	@Override
	public Person getByUsername(String username) {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Person p = s.get(Person.class, username);
		s.close();
		return p;
	}

}
