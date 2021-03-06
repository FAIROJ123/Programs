

/* @Purpose:Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week. Print the result as following.



 * @Author:S.Fairoj.
  
 * @Date:25/3/2018
 * */

package com.bridgeit.datastructures;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Calender
{
	
		 public static void main(String[] args) 
		 {
			    Util util=new Util();
			    Scanner sc=new Scanner(System.in);
			    System.out.print("Enter month (1-12): ");
		        int month = sc.nextInt();
		        if(month < 1 || month > 12)
		        {
		            System.out.println("Invalid month. Valids inputs are 1-12.");
		            System.exit(0);
		        }
		        System.out.print("Enter year: ");
		        int year = sc.nextInt();
		        if(year < 1753)
		        {
		            System.out.println("Invalid year. Valid inputs are 1753 and beyond.");
		            System.exit(0);
		        }
		        
		        String[] months = {
		            "",                               
		            "January", "February", "March",
		            "April", "May", "June",
		            "July", "August", "September",
		            "October", "November", "December"
		        };

		      
		        int[] days = {
		            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		        };

		        // check for leap year
		        if (month == 2 && util.leapYear(year)) days[month] = 29;


		        // print calendar header
		        System.out.println("   " + months[month] + " " + year);
		        System.out.println(" S  M Tu  W Th  F  S");

		        // starting day
		        int d = util.day(month, 1, year);

		        // print the calendar
		        for (int i = 0; i < d; i++)
		            System.out.print("   ");
		        for (int i = 1; i <= days[month]; i++) {
		            System.out.printf("%2d ", i);
		            if (((i + d) % 7 == 0) || (i == days[month])) 
		            	System.out.println();
		        }

		    }
		     
}
