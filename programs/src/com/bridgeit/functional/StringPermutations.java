/*
 * @Purpose:Write static functions to return all permutation of a String using iterative method and Recursion method. Check if the arrays returned by two string functions are equal. 
 * @Author:S.Fairoj
 * @Date:15/03/2018.
 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class StringPermutations
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=sc.nextLine();
		int n=st.length();
		util.permute(st, 0, n-1);
		
		
	}

}
