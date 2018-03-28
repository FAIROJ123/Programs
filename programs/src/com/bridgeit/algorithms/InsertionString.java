/*
 * @Purpose:Reads in strings from standard input and prints them in sorted order.
            Uses insertion sort.
 * @Author:S.Fairoj.
  
 * @Date:22/3/2018
  
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class InsertionString
{
	public static void main(String[] args) 

    {
	
	   Util util = new Util();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter number of elements");
	   int n = sc.nextInt();
	   String[] ar=new String[n];
       System.out.println("enter array elements");

		for (int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextLine();

		}
       
		util.insertionSort(ar);
	    util.display(ar);
	}

	
	
}
