

/*
 * @Purpose:Binary Search the Word from Word List

 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Findnumber

{

	public static void main(String[] args) {
		Util utility = new Util();
		System.out.println("enter number");
		int number = utility.inputInteger();
		int power = (int) Math.pow(2, number) - 1;
		int low = 0;
		System.out.println("assume the number between " + low + " to " + power);

		int value = utility.questionNumber(low, power);
		System.out.println("your asumed number is " + value);


	}

}
