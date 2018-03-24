/*
 * @Purpose:Write a static function toBinary that outputs the binary (base 2) representation of the decimal number typed as the input. It is based on decomposing the number into a sum of powers of 2. For example, the binary representation of 106 is 11010102, which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding to represent 4 Byte String.

 * @Author:S.Fairoj.
  
 * @Date:20/3/2018
 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to convert into binary");
		int n=sc.nextInt();
		
		util.convertBinary(n);
		
	}

	

}
