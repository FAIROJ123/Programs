/*
 * @Purpose:Write a Stopwatch Program for measuring the time that elapses between the start and end clicks

 * @Author:S.Fairoj
 
 * @Date:16/03/2018.   
 
 **/


package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Stopwatch
{
	private long startTime = 0;
    private long stopTime = 0;

   /* public Stopwatch()
    {
          startTime = System.currentTimeMillis();
    }*/
   public static void main(String[] args)
   {
	   Util util=new Util();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter 1  for the start time;");
	   double a=sc.nextDouble();
	  System.out.println( util.start());
	  System.out.println("enter  2 for the stop time:");
	  double stop=sc.nextDouble();
	  System.out.println();
	  System.out.println(util.stop());
	  util.stop1();
	  
   }
	
}