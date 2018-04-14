package com.bridgeit.objectorientedprograms;

import java.util.Comparator;

public class ZipSorter implements Comparator<Person>
{
	public int compare(Person p1, Person p2) {
		return p1.getzip().compareTo(p2.getzip());
	}
}
