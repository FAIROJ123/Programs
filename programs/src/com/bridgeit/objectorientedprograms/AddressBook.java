package com.bridgeit.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.lang.String;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeit.utillity.Util;

public class AddressBook

{

	 public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Util utility = new Util();
		System.out.println("Enter any positive number");
		int choice1 = utility.inputInteger();
       Addressbookmethod addressbook = new Addressbookmethod();
		while (choice1 > 0) {
            System.out.println("enter 1 to add addressbook to the file");
            System.out.println("enter 2 to delete the share from the file");
            System.out.println("enter 3 to display number of account");
            System.out.println("enter 4 to edit number of account");
            System.out.println("enter 5 to sort by name");
			System.out.println("Enter the choice");
			int choice = utility.inputInteger();
			utility.inputString();
			switch (choice) {
			case 1:

				Addressbookmethod.addobject("/home/bridgeit/Desktop/json.txt");
				break;

			case 2:
				Addressbookmethod.delete("/home/bridgeit/Desktop/json.txt");
				break;

			case 3:
				Addressbookmethod.display("/home/bridgeit/Desktop/json.txt");

				break;

			case 4:
				
				Addressbookmethod.edit("/home/bridgeit/Desktop/json.txt");
				break;
			case 5:
				Addressbookmethod.sortbyname("/home/bridgeit/Desktop/json.txt");
				break;
			
			}

		}
}

}