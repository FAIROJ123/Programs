



/*

 * @Purpose:Binary Search the Word from Word List

 * @Author:S.Fairoj.
  
 * @Date:19/3/2018
 
 * */

package com.bridgeit.algorithms;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class BinarySearchForwordsGenerics
{
	public static void main(String[] args) 
	
	{
		
	   Util util=new Util();
	   Scanner sc = new Scanner(System.in);
	   int i;  

	   System.out.println("Enter number of words you wish to input: ");
	   int n=sc.nextInt();

	   String[] words= new String[n];

	   System.out.println("Enter the words");
	   for ( i = 0; i < words.length; i++)
	   {
	       System.out.print("WORD " + (i + 1) + ": ");
	       words[i] = sc.next();
	   }

	   

	   Arrays.sort(words);
	   System.out.println("enter the word you want to search for");
	   String word=sc.next();
	   int index= util.searchWord(words,word);
	   System.out.println(word+ "="+ index);
	}
}
