package com.revature.basics;

// Try to use -ABLE in the NAME
// Runnable
// 
public interface ExampleInterface {
	public void runExample();
	
	public default void printExample() {
		System.out.println("Default");
	}
}
