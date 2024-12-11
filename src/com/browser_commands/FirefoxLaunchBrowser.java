package com.browser_commands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunchBrowser {

	public static void main(String[] args) {
		
	  FirefoxDriver driver =new FirefoxDriver();
	  driver.get("https://www.instagram.com");
//	  driver.close();
	}
}
