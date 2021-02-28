package com.revature.data.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

<<<<<<< HEAD
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
=======
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
>>>>>>> 8f84665d5132689b9ab7918072f380b21f448319

import com.revature.beans.Person;
import com.revature.data.PersonDAO;
import com.revature.exceptions.NonUniqueUsernameException;
import com.revature.utils.HibernateUtil;

public class PersonHibernate implements PersonDAO {
<<<<<<< HEAD
	
=======
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();

>>>>>>> 8f84665d5132689b9ab7918072f380b21f448319
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
<<<<<<< HEAD
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Person p = s.get(Person.class, username);
		s.close();
=======
		Session s = hu.getSession();
		// Criteria API: make queries w/ programmatic syntax
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<Person> criteria = cb.createQuery(Person.class);
		Root<Person> root = criteria.from(Person.class);
		
		Predicate predicateForUsername = cb.equal(root.get("username"), username);
		// Predicate predicateForPassword = cb.equal(root.get("password"), password);
		// Predicate predicateForBoth = cb.and(predicateForUsername, predicateForPassword);
		
		criteria.select(root).where(predicateForUsername);
		
		Person p = s.createQuery(criteria).getSingleResult();
>>>>>>> 8f84665d5132689b9ab7918072f380b21f448319
		return p;
	}

}
