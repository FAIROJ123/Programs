package com.bridgeit.objectorientedprograms;

import java.io.BufferedReader;
import java.lang.String;
import java.io.FileReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgeit.utillity.Util;

public class ReggularExpression
{
	public static void main(String[] args) 
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		String sentence="Hello <<name>>,We have your full name as <<full name>> in our system. ";
		String s=util.replaceNameFullname(sentence);
		System.out.println("the new sentence is:"+s);
		String sentence1="your contact number is 91-xxxxxxxxxx.";
		String s1=util.replaceMobilenumber( sentence1);
		System.out.println("new sentence is:"+s1);
		String sentence2="Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ";
		String s2=util.replaceDate(sentence2) ;
		System.out.println("The new String is:"+s2);
		String msg=s+s1+s2;
		
		System.out.println("The modified sentence is:"+msg);
		
	}
		

}