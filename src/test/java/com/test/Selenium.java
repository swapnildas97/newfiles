package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
	WebDriver driver =null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.02\\Desktop\\Browsers and Drivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println("alert text is "+alt.getText());
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  alt.accept();
  }
}
