package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtility_1 {
  @Test
  public void f() {
  WebDriver driver=DriverUtility.getDriver("chrome");
  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
  driver.get(url);
  driver.manage().window().maximize();
  System.out.println("title of the page "+driver.getTitle());
  Assert.assertEquals("Home", driver.getTitle());
  Assert.assertTrue("Home".contains("Home"));
  Assert.assertTrue("Home".startsWith("Ho"));
  }
}
