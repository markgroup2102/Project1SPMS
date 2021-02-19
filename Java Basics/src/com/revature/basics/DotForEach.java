package com.revature.basics;

import java.util.ArrayList;
import java.util.List;

public class DotForEach {

	public DotForEach() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void runExample() {
		List<String> names = new ArrayList<>();
		names.add("Jack");
		names.add("Jull");
		//names.foreach(); (Consumer<? super String> action) : void Iterable
		// What does this mean? 
		// The consumer uses each object in the collection with a type
		// that is of class String then takes some action using a lambda
		names.forEach(string -> System.out.println(string));
		for(String s : names) {
			
		}
	}
	
	public static void main(String[] args) {
		runExample();
	}

}
