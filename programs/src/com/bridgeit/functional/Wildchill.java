/*
 * @Purpose:Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
          Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:

          Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).
 * @Author:S.Fairoj
 * @Date:16/03/2018.

 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Wildchill 
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temparature value in Fahrenheit");
		double t=sc.nextDouble();
		System.out.println("enter the wind speed v value in miles per hour");
		double v=sc.nextDouble();
		util.getWild(t,v);
		
		
		
		
	}

}
