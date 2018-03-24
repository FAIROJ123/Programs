/*
 * @Purpose:Create Utility Class having following static methods
 *          1.bubbleSort method for integer
            2.bubbleSort method for String
 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 * 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class BubblesortGeneric 
{
	public static <E> void main(String[] args) 
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
        int n=sc.nextInt();
        E[] arr= (E[]) new Object[n];;
        System.out.println("enter array elements");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=(E) sc.next();

        }
        
        util.bubbleSort(arr);
        util.display(arr);
       
        
    }
}
