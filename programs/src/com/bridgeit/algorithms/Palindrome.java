package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Palindrome
 {
	public static void main(String[] args) 
	{
	    Util util=new Util();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
        int n=sc.nextInt();
        boolean rs=util.isPalindrome(n);
    
       if(rs==true)
       {
    	System.out.println("given number is palindrome");
        }
       else
    	System.out.println("given number is not a palindrome");

  }  

	
}
