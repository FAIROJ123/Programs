







/*
 * @Purpose:Create Utility Class having following static methods
            1.insertionSort method for integer
            2.insertionSort method for String

 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 
 * */

package com.bridgeit.algorithms;

import java.util.Comparator;
import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class InsertionSortGeneric
{
	public static <E, T> void main(String[] args)
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
		util.insertionSortGenerics(arr);
	    util.display(arr);
        String[] ar=new String[n];
        System.out.println("enter array elements");

		for (int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextLine();

		}
        
		util.insertionSortGenerics(ar);
	    util.display(ar);
	}
	

}
