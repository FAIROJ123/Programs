/*
 * @Purpose:Write a Util Static Function to calculate monthlyPayment that reads in three command-line arguments P, Y, and R and calculates the monthly payments you would have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly. The formula is The formula is

 * @Author:S.Fairoj.
  
 * @Date:20/3/2018.
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Monthlypayment 
{
	public static void main(String[] args)
	{
		Util util=new Util();
	
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        int loan = sc.nextInt();

        System.out.print("Enter loan term (in years): ");
        int years = sc.nextInt();

        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();
        util.payment(loan ,years, rate);
  
}
}