package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteriseTestInTestNG {

	@Test
	@Parameters({"uname","pwrd"})
	public void login(@Optional("Vaishali@gmal.com")String username,
			          @Optional("Vaishali@1234$#$") String password)
	
	{
		System.out.println("Username is >>>"+username);
		System.out.println("Password is >>>"+password);
	}
}
