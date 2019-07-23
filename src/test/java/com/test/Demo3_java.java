package com.test;
import java.util.*;
public class Demo3_java {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	   for(int i=0;i<size;i++)
	   {
		   System.out.println(arr[i]);
	   }
	}
}
