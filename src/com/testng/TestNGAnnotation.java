package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@Test
	public void test1()
	{
		System.out.println("test1()");
	}
	
	@Test
	public void test2()
	{
	  System.out.println("test2() ");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite()");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println(" beforeClass() ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod()");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println(" afterTest()");
	}
	
	public void afterClass()
	{
		System.out.println(" afterClass()");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println(" afterMethod()");
	}
	
	@BeforeGroups
	public void afterGroups()
	{
		System.out.println(" afterGroups() ");
	}
	
	
	
}
