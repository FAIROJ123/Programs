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
