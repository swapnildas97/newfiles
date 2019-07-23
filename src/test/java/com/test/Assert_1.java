package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_1 {
  @Test
  public void testmethod1() {
	  Assert.assertTrue(20>10);
  }
  @Test
  public void testmethod2() {
	  Assert.assertFalse("Hello".equals("Hi"));
  }
  @Test
  public void testmethod3() {
	  String actual="Hello";
	  String expected="Hello";
	  Assert.assertEquals("Hello","Hello");
  }
  @Test
  public void testmethod4() {
	  Object obj1=null;
	  Object obj2=new Object() ;
	  Assert.assertNull(obj1);
  }
  @Test
  public void testmethod5() {
	  Object obj1=new Object();
	  Object obj2=obj1;
	  Assert.assertSame(obj1,obj2);
  }
  @Test
  public void testmethod6() {
	  Assert.fail("Haters die please");
  }
  @Test
  public void testmethod7() {
	  System.out.println("Checking 1st validation");
	  Assert.assertEquals(10,11);
	  System.out.println("Checking 2nd validation");
	  Assert.assertEquals("hello","welcome");
	  
  }
}
