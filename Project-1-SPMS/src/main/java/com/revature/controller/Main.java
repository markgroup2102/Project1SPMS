package com.revature.controller;

import org.hibernate.Session;

import com.revature.models.Person;
import com.revature.utilities.HibernateUtil;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		Person p = sesh.get(Person.class, 3);
		System.out.println(p.toString());
		sesh.close();
	}

}
