/*
 * @Purpose:Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N .
 * @Author:S.Fairoj
 * @Date:14/03/2018.
 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class HormonicNumber {
	
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		util.hormonic(n);
		
	}

}
