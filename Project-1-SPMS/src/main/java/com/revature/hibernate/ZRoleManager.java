package com.revature.hibernate;

import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ZRoleManager {
	protected SessionFactory sessionFactory;
	private static Logger log = Logger.getLogger(ZRoleManager.class.getName());

	public ZRoleManager() {
		/*
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// some CRUD goes here
		
		session.getTransaction().commit();
		session.close();
		*/
	}
	
	protected void setup() {
		log.trace("Loading hibernate session factory");
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
		
	}
	
	protected void exit() {
		log.trace("Closing hibernate session factory");
		sessionFactory.close();
	}
	
	protected void create() {
		log.trace("Saving a new role in the table");
		Role role = new Role();
		role.setType("TEST-ROLE");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(role);
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	protected void read() {
		log.trace("Reading roles ");
	}
	
	protected void update() {
		log.trace("Updating role");
	}
	
	protected void delete() {
		log.trace("Removing a book");
	}
	
	
	public static void main(String[] args) {
		log.info("Starting program");
		ZRoleManager zrm = new ZRoleManager();
		zrm.setup();
		zrm.create();
		zrm.exit();
	}

}
