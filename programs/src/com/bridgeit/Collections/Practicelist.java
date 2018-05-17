package com.bridgeit.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;


public class Practicelist {
	public static void main(String[] args) {
		 List list=new ArrayList();
		 list.add("fair");
		 list.add("rossy");
		 
		 
	 
		 List al= new LinkedList();//it allows the duplicates.it follows insertion order.
		 al.add("saru");
		 al.add("affu");
		 al.add("ammu");
		 al.add("saru");
		 
		 HashSet set=new HashSet();
		 set.add(12);// hashset not allows the duplicate values.Doesn't allow the order also.
		 set.add(45);
		 set.add(12);
		 set.add(23);
		 
		 LinkedHashSet  lh=new LinkedHashSet();//it follows insertion order.It having the equals().
		 lh.add(12);
		 lh.add(9);
		 lh.add(45);
		 lh.add(67);
		 
		 
		 TreeSet t=new TreeSet();//it follows the sorted order.It having the compareTo().
		 t.add(8);
		 t.add(89);
		 t.add(12);
		 t.add(3);
		 
	 
		 System.out.println(set);
		 System.out.println(list);
		 System.out.println(al);
		 System.out.println(lh);
		 System.out.println(t);
		 
		 Iterator it=al.iterator();
		 
			 while(it.hasNext())
			 {
				 System.out.println(it.next());
			 }
			 
			 
			
		 
	}
	
	 

}
