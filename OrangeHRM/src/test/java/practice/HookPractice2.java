package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HookPractice2 extends HookPractice {

	//Hooks are annotations that are used to run a piece of code over and over without having to write it again and again. 
	//There are few different hooks with different functionalities
	/*1.@Before method: it will run before each test method
	 * 2.@before class: it will run before that class
	 * 3.@before group: it will run before each test group
	 * 4.@before test: it will run before the entire test run
	 * 5. @before test suite: it will run before each test suite
	 * 
	 * all of them have a @after annotation
	 */
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("This is before suit.");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suit.");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is before Group.");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("This is after group.");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test.");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test.");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	
	@Test  (groups="even")
	public void test10() {
		System.out.println("This is test10");
	}
	
	@Test (groups="odd")
	public void test11() {
		System.out.println("This is test11");
	}
	
	@Test   (groups="even")
	public void test12() {
		System.out.println("This is test12");
	}
	
}
