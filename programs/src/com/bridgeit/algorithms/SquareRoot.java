
 /* @Purpose:Write a static function sqrt  to compute the square root of a nonnegative number c given in the input using Newton's method:

 * @Author:S.Fairoj.
  
 * @Date:20/3/2018.
  
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class SquareRoot
{
public static void main(String[] args) 
{
	Util util=new Util();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value for calculating square root");
	double a=sc.nextDouble();
	util.squareroot(a);
	
}
}
