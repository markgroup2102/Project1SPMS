package com.revature.singleton;

/**
 * A singleton is something that can only have one instance in memory
 * @author mwhis
 *
 */
public class Singleton {

	private static Singleton instance; // create an instance of a Singleton
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
		
/**
		Singleton Pattern
		A Singleton is a design pattern which allows the creation of an object in memory only once in an application and can be shared across multiple classes. It can be useful for services in an application, or other resources like a connection or thread pool.

		To make a class into a Singleton, use:

		private static variable of the class' type
		private constructor - to prevent arbitrary object creation
		public static getInstance() method, which will either instantiate the object or return the instance in memory
		return instance;
	}
}
**/
