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