package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testme {
	WebDriver driver =null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers and Drivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.close();
  }
}
