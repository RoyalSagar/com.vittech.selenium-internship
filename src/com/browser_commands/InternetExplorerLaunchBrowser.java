package com.browser_commands;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerLaunchBrowser {

	public static void main(String[] args) {
		
		InternetExplorerDriver driver =new InternetExplorerDriver();
		driver.get("https://www.amazon.com");
//		driver.close();
	}
}
