package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parentchild {
	WebDriver driver =null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers and Drivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  String url="http://demo.guru99.com/popup.php";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentWindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.name("emailid")).sendKeys("s.swagatapandaz@gmail.com");
	  driver.findElement(By.name("btnlogin")).click();
	  System.out.println("Child Window title is"+driver.getTitle());
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  System.out.println("parent window title"+driver.getTitle());
  }
}
