






/* @Purpose:To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula
                Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
                Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 

 * @Author:S.Fairoj.
  
 * @Date:23/3/2018
 * */


package com.bridgeit.algorithms;

import com.bridgeit.utillity.Util;
import java.util.Scanner;

public class Temparature
{
	public static void main(String[] args) 
	{
		
	
	Util util=new Util();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperatue in Fahrenheit");
	float t=sc.nextFloat();
	util.convertionintoCelsius(t);
	util.covertionintoFahrenheit(t);
}
}