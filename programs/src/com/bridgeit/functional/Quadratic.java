/*
 * @Purpose:Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
           delta = b*b - 4*a*c
           Root 1 of x = (-b + sqrt(delta))/(2*a)
           Root 2 of x = (-b - sqrt(delta))/(2*a)
          Take a, b and c as input values to find the roots of x.
 * @Author:S.Fairoj
 * @Date:16/03/2018.
 **/

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Quadratic
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("given quadratic equation:a*x*x+b*x+c=0");
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		
		util.getQuadratic(a, b, c);
		
		
	}

}
