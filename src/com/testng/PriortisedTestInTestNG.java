package com.testng;

import org.testng.annotations.Test;

public class PriortisedTestInTestNG {

	@Test(priority =-1)
	public void login()
	{
		System.out.println(" Login success ....!!!");
	}
	
	@Test(priority = 0)
	public void updateProfile()
	{
		System.out.println("update the profile successfully...");
	}
	
	@Test(priority=1)
	public void logout()
	{
		System.out.println(" logout success...!!!");
	}
	
	@Test
	public void createProfile()
	{
		System.out.println(" createProfile()");
	}
	
	@Test
	public void deleteProfile()
	{
		System.out.println(" deleteProfile() ");
	}
	
	
}
