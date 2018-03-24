/*
 *@Purpose:Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
 * @Author:S.Fairoj
 * @Date:15/03/2018.
 **/


package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Gambler {
	
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stake");
		int a= sc.nextInt();
		System.out.println("enter a goal:");
		int goal=sc.nextInt();
		System.out.println("Enter number of trials");
		int n= sc.nextInt();
		util.game(a,goal, n);
		
	}

}
