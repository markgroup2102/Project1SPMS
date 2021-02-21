package com.revature.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hibernate.SessionFactory;


public class HibernateUtility {

	private static HibernateUtility hu;
	private static Properties p;
	
	// Private constructor 
	private HibernateUtility() {
		p = new Properties();
		try {
			InputStream dbProps = HibernateUtility.class.getClassLoader().
				getResourceAsStream("database.properties");
			p.load(dbProps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static HibernateUtility getHibernateUtility() {
		if(hu == null) {
			hu = new HibernateUtility();
		}
		return hu;
	}
	
	public static SessionFactory getSessionFactory() {
		SessionFactory sf = null;
		return sf;
	}
	
}
