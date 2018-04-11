package com.bridgeit.objectorientedprograms;

public class FirstNameSorter 
{
	public static int compare(Person p1, Person p2) {
		return p1.getfirstName().compareTo(p2.getfirstName());
	}
}
