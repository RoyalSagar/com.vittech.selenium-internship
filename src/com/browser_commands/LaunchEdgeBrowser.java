package com.browser_commands;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
}

