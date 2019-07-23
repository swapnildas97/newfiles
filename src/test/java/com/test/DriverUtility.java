package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility{
public static WebDriver getDriver(String browser){
	if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\BROWSER AND DRIVERS\\chromedriver.exe");	
return new ChromeDriver();
	}else if(browser.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\BROWSER AND DRIVERS\\chromedriver.exe");
	    return new InternetExplorerDriver();
	}
	return null;
	}
}