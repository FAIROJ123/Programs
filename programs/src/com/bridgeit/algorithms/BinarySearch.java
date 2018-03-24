/*
 * @Purpose:Create Utility Class having following static methods
           1. binarySearch method for integer
           2.binarySearch method for String

 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class BinarySearch
{
  public static void main(String[] args)
  {
	    Util util = new Util();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		System.out.println("enter array elements");

		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();

		}
		System.out.println("enter a element to search:");
		int a =sc.nextInt();
		
		int foundIndex = util.binarySearch(arr, Integer.valueOf(a),0,n-1);
	    System.out.println("Integer Array Contain element  at index = " + foundIndex);
	    System.out.println("enter number of elements");
		int n1= sc.nextInt();
	    String[] ar=new String[n1];
        System.out.println("enter array elements");

		for (int i = 0; i < n1; i++) 
		{
			ar[i] = sc.next();

		}
		
		System.out.println("enter a string to search:");
		String a1 =sc.next();
        int index = util.binarySearch(ar, String.valueOf(a1),0,n-1);
	    System.out.println("Integer Array Contains item +i+ at index = " + index);
       
	}


}
