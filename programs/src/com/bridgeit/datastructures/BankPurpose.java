package com.bridgeit.datastructures;

import java.util.Scanner;

public class BankPurpose 
{
	double mBalance=0;
	int mcount;
	Scanner sc=new Scanner(System.in);
	QueueImpl q=new QueueImpl();
	
	void deposit(int option){
	        q.enQueue(option);
	        System.out.println("Enter the amount to deposit:");
	 	double amt1=sc.nextDouble();
	        System.out.println("Deposting Rs."+amt1);
		mBalance=mBalance + amt1;
		System.out.println(mBalance);
		mcount++;
		q.deQueue();
	}
	
	void withdarw(int option){
		q.enQueue(option);
		System.out.println("Enter the amount to withdraw:");
		double amt=sc.nextDouble();
		if(amt <= mBalance){
			System.out.println("Enter the amount to withdraw:");
		    	System.out.println("Withdrawing Rs."+amt);
			mBalance=mBalance - amt;
			mcount++;
		    	q.deQueue();
	        }
	        else
	        	System.out.println("Insuuficient balance");
	}
	
	void balanceEnquery(){
	    
		System.out.println("The available balance"+mBalance);
	}
	
	void transactionCount(){
		System.out.println("The number of transaction so far:"+mcount);
}
}
