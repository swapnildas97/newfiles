package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 {
	WebDriver driver =null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers and Drivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	  driver.findElement(By.xpath("//input[@class='email']")).sendKeys("heythere@gmail.com");
	  driver.findElement(By.xpath("//input[@class='password']")).sendKeys("qwerty1234");
	  driver.findElement(By.xpath("//input[@type='submit'][@value='Log in']")).click();
	  driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	  
  }
}
