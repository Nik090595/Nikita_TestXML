package com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	@Test(enabled = false)
	public void testng() {
		System.out.println("Test Anotation");
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void Test() {
		System.out.println("Test");
	}
	
	@Test(priority =1)
	public void test1() {
		System.out.println("Test_1");
	}
	
	@Test(priority=-1)
	public void test2() {
		System.out.println("Test_2");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	
}
