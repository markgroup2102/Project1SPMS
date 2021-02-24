package com.revature.utilities;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

// Derived from https://www.javaguides.net/2018/11/hibernate-5-xml-configuration-example.html
// Added logging -mark whiskeyman
public class HibernateUtility {

	private static Configuration con;
	private static StandardServiceRegistry reg;
	private static SessionFactory sessions;
	private static Logger log = Logger.getLogger(HibernateUtility.class.getName());
	public HibernateUtility() {
	
	}
	
	public static SessionFactory getSessionFactory1() {
		log.trace("Trying to create a session factory...");
		if(sessions == null) {
			try {
				
				//con.configure("hibernate.cfg.xml");
				reg = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources src = new MetadataSources(reg);
				Metadata md = src.getMetadataBuilder().build();
				sessions = md.getSessionFactoryBuilder().build();
				/*
				Configuration cfg =new Configuration().addFile("hibernate.cfg.xml");
				sessions = cfg.buildSessionFactory();
				*/
				
			}catch (Exception e) {
				log.warn("Failed to create Session factory see trace level for details");
				log.trace(e.getStackTrace().toString());
				e.printStackTrace();
				if(reg!=null) {
					StandardServiceRegistryBuilder.destroy(reg);
				}
			}
		}
		return sessions;
	}
}
