package com.browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String pageTitle = driver.getTitle();
		System.out.println("Facebook Login Page Title: "+pageTitle);
		
		String currentURL= driver.getCurrentUrl();
		System.out.println("Facebook current url :"+currentURL);
		
		String pagesource=driver.getPageSource();
		
		System.out.println(pagesource.contains(pageTitle));
		
	driver.close();
//		driver.quit();
		
	}
}

