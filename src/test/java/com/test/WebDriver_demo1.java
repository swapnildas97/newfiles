package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_demo1 {
 WebDriver driver= null; 
	@Test
  public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers and Drivers\\chromedriver.exe\\");
	driver= new InternetExplorerDriver();
 String url="http://www.google.com";
 driver.get(url);
 driver.manage().window().maximize();
 System.out.println("the title of the page is "+driver.getTitle());;
	}
}
