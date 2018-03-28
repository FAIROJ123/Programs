

/* @Purpose: Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.


 * @Author:S.Fairoj.
  
 * @Date:24/3/2018
 * */


package com.bridgeit.datastructures;

import java.util.Scanner;

public class BankQueue
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	BankPurpose  bq=new BankPurpose ();
	boolean check = true;
	while(check){
	System.out.println("Enter the option: \n 1.Deposit \n 2.Withdraw \n 3.BalanceEnquery \n 4.To know about number transactions done \n 5.Exit");
	int option=sc.nextInt();
	//For displaying user interactive interface
	switch(option){
		case 1:	bq.deposit(option);
	                break;
		        
		case 2:bq.withdarw(option);
	         	break;
	         	
	        case 3:bq.balanceEnquery();
	         	break;
	         
	       	case 4:bq.transactionCount();
	         	break;
	         	 
	      	case 5:check=false;
	      		break;
	      	       
	}
	
}
}
}
