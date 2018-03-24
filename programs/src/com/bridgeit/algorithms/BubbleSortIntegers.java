/*
 * @Purpose:Reads in integers prints them in sorted order using Bubble Sort.

 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 * */
package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class BubbleSortIntegers 
{
	public static void main(String[] args) 
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
        int n=sc.nextInt();
        int[] arr=  new int[n];;
        System.out.println("enter array elements");
        
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();

        }
        util.bubbleSorting( arr); 
        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }
       
        
    }
}
