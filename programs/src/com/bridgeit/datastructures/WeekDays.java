

/* @Purpose:To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, 
 
 * @Author:S.Fairoj.
  
 * @Date:23/3/2018
 * */

package com.bridgeit.datastructures;

import com.bridgeit.utillity.Util;

public class WeekDays 
{
	public static void main(String[] args) {
		Util util = new Util();

		System.out.println("Please Enter the year ");
		int year = util.inputInteger();
		System.out.println("Please Enter the months");
		int months = util.inputInteger();
		Util.leapYear(year);
		int daycode = util.dayCode(year, months);
		util.store(daycode,months);
		util.print(year, daycode, months);

		System.out.println();

	}


}
