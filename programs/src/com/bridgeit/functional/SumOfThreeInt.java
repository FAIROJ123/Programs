package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class SumOfThreeInt
{
   public static void main(String[] args)
   {
	   Util util=new Util();
	 
	  
	 int arr[]= {0, -1, 2,-3,1};
	 int n=arr.length;
	  util.findTriplets(arr, n);
	   
   }
}
