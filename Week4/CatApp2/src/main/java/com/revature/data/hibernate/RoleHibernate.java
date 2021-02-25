package com.revature.data.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.beans.Cat;
import com.revature.beans.Person;
import com.revature.beans.Role;
import com.revature.data.RoleDAO;
import com.revature.utils.HibernateUtil;

public class RoleHibernate implements RoleDAO {
	HibernateUtil hu =  HibernateUtil.getHibernateUtil();
	@Override
	public Role getById(Integer id) {
		Session s = hu.getSession();
		Role c = s.get(Role.class, id);
		s.close();
		return c;
	}

	@Override
	public Set<Role> getAll() {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		String query = ("FROM Role");
		Query<Role> q = s.createQuery(query,Role.class);
		List<Role> l = q.getResultList();
		Set<Role> p = new HashSet<>();
		p.addAll(l);
		s.close();
		return p;
	}

	@Override
	public void update(Role t) {
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
	public void delete(Role t) {
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
	public Role add(Role r) {
		Session s = HibernateUtil.getHibernateUtil().getSession();
		Transaction trx = null;
		try {
			trx = s.beginTransaction();
			s.save(r);
			trx.commit();
		}catch(Exception e) {
			if(trx!=null) {
				trx.rollback();
			}
		}finally {
			s.close();
		}
		return r;
	}
}

