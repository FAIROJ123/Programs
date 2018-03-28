/*
 * @Purpose:Write a program with Static Functions to do Merge Sort of list of Strings. 

 * @Author:S.Fairoj.
  
 * @Date:22/3/2018
 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		
	
	Util util = new Util();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter number of elements");
	   int n = sc.nextInt();
	   int[] arr=new int[n];
    System.out.println("enter array elements");

		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();

		}
		 util.sort(arr, 0, arr.length-1);		
	     System.out.println("\nSorted array");
	     util. printArray(arr);
	}

}