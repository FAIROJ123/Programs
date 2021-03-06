


/*

 * @Purpose:Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
     i. Swap nibbles and find the new number.
     ii. Find the resultant number is the number is a power of 2.

 * @Author:S.Fairoj.
  
 * @Date:20/3/2018
 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class SwapNibbles
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to convert into binary");
		int n=sc.nextInt();
		util.integerBinary(n);
		System.out.print(util.swapNibbles(n));
		boolean rs=util.isPowerOfTwo(n);
		if(rs)
		{
			System.out.println("The resultant number is power of two");
		}
		else
			System.out.println( "The resultant number is not a power of two");
		
		}
}
