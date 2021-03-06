


/*
 * @Purpose:Further maintain the Stock Symbol Purchased or Sold in a Stack implemented using Linked List to indicate transactions done.
 * @Author:S.Fairoj
 * @Date:29/03/2018
 * */


package com.bridgeit.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Stack;

import org.json.simple.JSONObject;

import com.bridgeit.utillity.Util;

public class StockSymobolStack
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		
		Util utility = new Util();
		Stack<JSONObject> stack = utility.shareTransactionusingStack();
		System.out.println(stack.toString());
}
}
