/*
 * @Purpose:Flip Coin and print percentage of Heads and Tails
           I/P -> The number of times to Flip Coin. Ensure it is positive integer.
           Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
           O/P -> Percentage of Head vs Tails
 * @Author:S.Fairoj
 * @Date:14/03/2018.
 * */

package com.bridgeit.functional;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.utillity.Util;


public class Flipcoin {
	
	
	public static void main(String[] args)
	{
		
		Util util = new Util();
		Scanner scanner=new Scanner(System.in);
	    System.out.println("enter a number for flip");
	    int n=scanner.nextInt();
	    util.flip(n);
	    
	    
	
	
	}
	
}

