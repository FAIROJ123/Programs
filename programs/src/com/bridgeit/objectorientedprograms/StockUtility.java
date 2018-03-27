package com.bridgeit.objectorientedprograms;

import java.util.Scanner;

public class StockUtility
{
	int mNumber;
	double mAllTotal = 0;
	
	Scanner sc=new Scanner(System.in);
	String mName[] = new String[100];
	int mShare[] = new int[100];
	double mValue[] = new double[100];
	double mTotal[] = new double[100];
	
	public void entry(int mNumber){
		this.mNumber = mNumber;
		for(int i=0;i<mNumber;i++){
			System.out.println("Please Enter Details for Stock: ");
			System.out.println("Name:");
			mName[i] = sc.next();
			System.out.println("No. of shares:");
			mShare[i] = sc.nextInt();
			System.out.println("Value for Each share:");
			mValue[i] = sc.nextDouble();		
		}
		
	}
	
	public void calculate(){
		for(int i=0;i<mNumber;i++){
			
			mTotal[i] = mShare[i]*mValue[i];
			System.out.println("Total value for Stock "+(i+1)+" is: "+mTotal[i]+" Rs.");
		}
	}
	
	public void totalval(){
		for(int i=0;i<mNumber;i++){
			mAllTotal = mAllTotal+mTotal[i];
		}
		System.out.println("\nTotal value of all "+mNumber+" Stock is: "+mAllTotal+" Rs.");
	}

}