package com.revature.utilities;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

// Derived from https://www.javaguides.net/2018/11/hibernate-5-xml-configuration-example.html
// Added logging -mark whiskeyman
public class HibernateUtility {

	private static StandardServiceRegistry reg;
	private static SessionFactory sf;
	private static Logger log = Logger.getLogger(HibernateUtility.class.getName());
	public HibernateUtility() {
	
	}
	
	public static SessionFactory getSessionFactory1() {
		log.trace("Trying to create a session factory...");
		if(sf == null) {
			try {
				reg = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources src = new MetadataSources(reg);
				Metadata md = src.getMetadataBuilder().build();
				sf = md.getSessionFactoryBuilder().build();
				
			}catch (Exception e) {
				log.warn("Failed to create Session factory see trace level for details");
				log.trace(e.getStackTrace().toString());
				e.printStackTrace();
				if(reg!=null) {
					StandardServiceRegistryBuilder.destroy(reg);
				}
			}
		}
		return sf;
	}
}
