


/*
 * @Purpose:Further maintain DateTime of the transaction in a Queue implemented using Linked List to indicate when the transactions were done.
 * @Author:S.Fairoj
 * @Date:29/13/2018
 * */


package com.bridgeit.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Queue;

import org.json.simple.JSONObject;
import org.omg.CORBA.MARSHAL;

import com.bridgeit.utillity.Util;

public class StockQueue {
	
		
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();

		Queue<JSONObject> queue = utility.shareTransaction();
		System.out.println(queue.toString());

	}

}
