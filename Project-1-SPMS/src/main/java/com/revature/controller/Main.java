package com.revature.controller;



import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.revature.utilities.HibernateUtility;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		try (SessionFactory sf = HibernateUtility.getSessionFactory1();){
			Session s = sf.openSession();
			System.out.println("SOmrthing");
			s.close();
		}catch(Exception e ) {
			
		}
	}

}
