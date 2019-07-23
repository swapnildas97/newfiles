package com.test;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2)
  public void Login() {
  System.out.println("this login class");
  }

@Test(priority=1)
public void Register() {
System.out.println("this register class");
}
@Test(priority=3)
public void Logout() {
System.out.println("this logout class");
 }
}