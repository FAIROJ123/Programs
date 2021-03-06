

/*
 * @Purpose:Maintain the List of CompanyShares in a Linked List So new CompanyShares can be added or removed easily. Do not use any Collection Library to implement Linked List.
 * @Author:S.Fairoj
 * @Date:28/13/2018
 * */

package com.bridgeit.objectorientedprograms;

import java.io.IOException;
import java.text.ParseException;

import com.bridgeit.utillity.Util;

public class CompanyShares 
{
	public static void main(String[] args) throws IOException, ParseException
	  {
		Util utility = new Util();
		System.out.println("Enter any positive number");
		int choice1 = utility.inputInteger();
			
		while(choice1>0)
		{
			
			System.out.println("Enter 1 to add shares to the file.");
			System.out.println("Enter 2 to remove share from file");
			System.out.println("Enter 3 to display Company Shares");
			
			int option = utility.inputInteger();
			
			switch(option)
			{
			case 1:
				utility.addShares("CompanyShares.json");
			    break;
			    
			case 2:
				 utility.removeShare("CompanyShares.json");
				 break;
				 
			case 3:
				
				 utility.displayShares("CompanyShares.json");
				 break;
				 
		
            }
      }
		
	  }
	
}

		
	  