/*
 * @Purpose:Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 * @Author:S.Fairoj
 * @Date:15/03/2018.
 **/

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Distance 
{
   public static void main(String[] args)
   {
	   Util util=new Util();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter first integer:");
	   int x=sc.nextInt();
	   System.out.println("enter second integer");
	   int y=sc.nextInt();
	   util.distance(x, y);
	   
	   
   }
}
