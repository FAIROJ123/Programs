package com.bridgeit.objectorientedprograms;

import java.util.Comparator;

public class SortbyLastName implements Comparator<Person>
{
	public int compare(Person p1, Person p2) {
		return p1.getlastName().compareTo(p2.getlastName());
	}
}
