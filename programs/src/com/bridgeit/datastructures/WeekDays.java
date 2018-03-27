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
