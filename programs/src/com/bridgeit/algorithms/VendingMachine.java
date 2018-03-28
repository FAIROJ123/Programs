





/*
 * @Purpose:There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change

 * @Autho:S.Fairoj.
 
 * @Date:20/3/2018.
  
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class VendingMachine 
{
	 
	public static void main(String[] args)
	{
	
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Change to be Returned");
		int value = sc.nextInt();
		System.out.println("change Values:");		
	
	
		if(value != 0)
		{
			 util.function(value);
			 
		}
		else
		System.out.println("No Change");
		
		 	
	}
	

}
