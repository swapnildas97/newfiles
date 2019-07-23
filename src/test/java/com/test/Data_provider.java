package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Data_provider {
  @Test(dataProvider = "getdata")
  public void setData(String username, String password) {
 System.out.println("you have provided username as: "+username);
 System.out.println("you have provided password as: "+password);
  }

  @DataProvider
  public Object[][] getdata() {
    Object[][]data= {
    		{"aravind","kumar"},
    		{"shrinikethan","sample"},
    		{"shrinivans","sampletest"}
    };
 return data;
  };
}
