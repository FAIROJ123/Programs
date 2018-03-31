
/*
 * @Purpose:Create Object Oriented Analysis and Design of a simple Address Book Problem.
 * @Author:S.Fairoj
 * @Date:30/13/2018
 * */


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
			
			switch (choice) {
			case 1:

				addressbook.addobject("/home/bridgeit/Desktop/AddressBook.json");
				break;

			case 2:
				addressbook.delete("/home/bridgeit/Desktop/AddressBook.json");
				break;

			case 3:
				addressbook.display("/home/bridgeit/Desktop/AddressBook.json");

				break;

			case 4:
				
				addressbook.edit("/home/bridgeit/Desktop/AddressBook.json");
				break;
			case 5:
				addressbook.sortbyname("/home/bridgeit/Desktop/AddressBook.json");
				break;
			
			}

		}
}

}
