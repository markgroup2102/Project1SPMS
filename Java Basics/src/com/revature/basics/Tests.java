package com.revature.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Tests {

	@BeforeClass
	void runMeFirst() {
		System.out.println("This should run any tests");
	}
	
	@Before
	void runMe() {
		System.out.println("This should run before all tests");
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
	}
	
//	JUnit Annotations
//	JUnit is a Java framework for unit testing. JUnit has several annotations within the org.junit package that developers can use to create tests and setup test environments:
//
//	@Test - declares a method as a test method
//	@BeforeClass - declares a setup method that runs once, before all other methods in the class
//	@Before - declares a setup method that runs before each test method
//	@After - declares a tear-down method that runs before each test method
//	@AfterClass - declares a tear-down method that runs once, after all other methods in the class
//	When writing a test method, JUnit helps us check the functionality of the code being tested by providing static Assert methods, of which there are many. A few include:
//
//	assertTrue()
//	assertFalse()
//	assertEquals()
//	assertNotEquals()
//	assertThat()
//	Utilize dependency injection
//	Write testable code
//	Use a mocking library like Mockito for dependencies
//	Measure your code coverage with a tool like Jacoco
//	Externalize test data when possible (i.e. read in the test data from an external file or generate it dynamically)
//	Generally, you want to use only 1 assert statement per test - this ensures you can pinpoint the defect when debugging
//	Write deterministic tests (they shouldn't fail sometimes and pass other times - otherwise known as "flaky" tests)

}
