package com.revature.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static HibernateUtil hu;
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() {
		super();
	}
	
	public synchronized static HibernateUtil getHibernateUtil() {
		if (hu == null)
			hu = new HibernateUtil();
		return hu;
	}
	
	public  synchronized SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			StandardServiceRegistry standardRegistry =
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(standardRegistry)
					.getMetadataBuilder()
					.build();
			sessionFactory = meta.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}
	
	public Session getSession() {
		return this.getSessionFactory().openSession();
	}
}
