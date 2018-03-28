

/*
 *  @Purpose:Extend the Prime Number Program and store only the numbers in that range that are Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram

 * @Author:S.Fairoj.
  
 * @Date:24/3/2018
 * */


package com.bridgeit.datastructures;

import com.bridgeit.utillity.Util;

public class PrimeAnagrams2D 
{
public static void main(String[] args)
{
	Util util=new Util();
	System.out.println("Program Started ");
	System.out.println("Anagaram Number");
	util.dispPrimeAngram( 1000);
   System.out.println("Program Ended");
}
}
