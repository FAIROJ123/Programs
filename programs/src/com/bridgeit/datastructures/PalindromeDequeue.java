package com.bridgeit.datastructures;

import java.util.Scanner;

public class PalindromeDequeue
{
	public static void main(String[] args){
        int count=0;
		Scanner sc=new Scanner(System.in);
		DequeueImpl dq=new DequeueImpl();
		System.out.println("Enter the string");
		
		String str=sc.next();
		
		for(int i=0;i<str.length();i++){
			dq.addFront(str.charAt(i));
		}
		int size=dq.getSize();
		System.out.println(size);
		while(count<size/2){
		     count++;
			if(dq.removeFront().equals(dq.removeRear())!=true){
				System.out.println("The given  string is not  palindrome");
				break;
			}
		}
		if(count>=size/2){
		System.out.println("The given String is palindrome");    		
	}	        		
}
}
