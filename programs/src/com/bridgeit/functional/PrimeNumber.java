package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class PrimeNumber {
	
	public static void main(String[] args)
	 {
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
	    util.prime(n);
		System.out.print("The Prime Factors of "+n+" ");
		
   	 
		
	 }

}
