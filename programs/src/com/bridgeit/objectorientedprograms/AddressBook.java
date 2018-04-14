package com.bridgeit.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.crypto.Data;

import org.json.simple.parser.JSONParser;

import com.bridgeit.utillity.Util;

public class AddressBook 
{
	Scanner sc=new Scanner(System.in);
	String firstName, lastName, city, state, zip, phone;
	ArrayList<Person> list=new ArrayList<Person>();
	
	JSONParser parser=new JSONParser();
	public void operation() throws IOException {
		
		boolean status=true;
		do{
		System.out.println("Choose Operation you want to do");
		System.out.println("1. Add\t2. Edit\t3. sort\t4. delete\t5. Exit");
		switch (sc.nextInt()) {
		case 1: add();
				break;
		case 2: edit();
				break;
		case 3:sort();
		       break;
		case 4:
			System.out.println("enter the person firstName:");
			firstName = sc.next();
			deleteByfirstname(firstName);
			System.out.println("Successfully deleted");
			System.out.println(list);
		       break;
		
		case 5:	status=false;
				break;
		}
		}
		while(status);
	}
		Util util=new Util();
		
	public void add() throws IOException
	{
		
		System.out.println("enter the person firstname");
		firstName = sc.next();
		System.out.println("enter the person lastName:");
		lastName = sc.next();
		System.out.println("enter the person city:");
		city = sc.next();
		System.out.println("enter the person state:");
		state = sc.next();
		System.out.println("enter the person zip:");
		zip = sc.next();
		System.out.println("enter the person phone number:");
		phone = sc.next();
		list.add(new Person(firstName, lastName, city, state, zip, phone));
		System.out.println(list);
		System.out.println("Successfully added");
		System.out.println("\nThere are " + list.size() + " people in this address book.\n");
		
	    System.out.println("save the file");
		
	}
	public void deleteByfirstname(String firstName) {
		
		for (Iterator<Person> iterator = list.iterator(); iterator.hasNext();) {
			Person temp = (Person) iterator.next();

			if (temp.getfirstName().equalsIgnoreCase(firstName)) {
				iterator.remove();
				return;
			}
			System.out.println("successfully deleted");
			
		}

		System.out.println("No contact with first name " + firstName + " was found.");
	}
	public void edit() throws IOException {
		System.out.println("enter your firstname:");
		String fname = util.inputString();
		Scanner sc=new Scanner(System.in);
		
		for (Iterator<Person> iterator = list.iterator(); iterator.hasNext();)
		{
		
			Person temp = (Person) iterator.next();

		if (fname.equalsIgnoreCase(temp.getfirstName())) {

			System.out.println("1.state");
			System.out.println("2.city");
			System.out.println("3.zip");
			System.out.println("4.phonenumber");
			System.out.println("enter your choice which do you want to edit:");
			int choice = util.inputInteger();
			
			switch (choice) {

			case 1:

				System.out.println("enter your new state");
				String state = util.inputString();
				temp.setstate(state);
				
				break;
				
			case 2:
				 System.out.println("enter your new city");
				 String city=util.inputString();
				 temp.setcity(city);
				
				 break;
				
				 
			case 3:
				
				 System.out.println("enter your new zip");
				 String zip=util.inputString();
				 temp.setzip(zip);
				 
				 break;
				 
			case 4:
				 System.out.println("enter your new phonenumber");
				 String phone=util.inputString();
				 temp.setzip(phone);
				 
				 break;
				 
		   default:
			    System.out.println("wrong choice");
			    break;

			}
			
			System.out.println("Successfully edited");
			
           System.out.println(list);
          
           
           System.out.println("you added new data:type true if yes or type false");
          boolean flag=sc.nextBoolean();
   		if(flag)
   		{
   			System.out.println("save the file");
   			
   		}
		}
			
		}
		
		}
 public void sort()
 {
	 System.out.println("1.Sorting based on FirstName");
		System.out.println("2.Sorting based on Zip code");
		System.out.println("Enter which do you want:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
			
			Collections.sort(list, new SortbyLastName());
	        break;
		case 2:
			
		Collections.sort(list,new ZipSorter());
			break;
		}
		

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println();

	
	

}
public ArrayList<Person> list() {
	// TODO Auto-generated method stub
	return list;
}


 
}
