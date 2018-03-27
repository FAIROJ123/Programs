package com.bridgeit.datastructures;

import java.util.Scanner;
import java.util.Stack;

import com.bridgeit.utillity.Util;

public class BalancedParanthesis {
	public static void main(String[] args) throws Exception

	{
		Util util = new Util();
		Scanner scan = new Scanner(System.in);

		Stack stk = new Stack();

		System.out.println("Parenthesis Matching Test\n");

		System.out.println("Enter expression");

		String exp = scan.next();
		int len = exp.length();

		System.out.println("\nMatches and Mismatches:\n");
		boolean flag = false;
		for (int i = 0; i < len; i++)

		{

			char ch = exp.charAt(i);

			if (ch == '(')

				stk.push(i);

			else if (ch == ')')

			{

				try

				{

					int p = (int) stk.pop() + 1;

					System.out.println("')' at index " + (i + 1) + " matched with ')' at index " + p);

				}

				catch (Exception e)

				{

					System.out.println("')' at index " + (i + 1) + " is unmatched");

				}

			}

		}

		while (!stk.isEmpty())

			System.out.println("'(' at index " + ((int) stk.pop() + 1) + " is unmatched");

	}
}
