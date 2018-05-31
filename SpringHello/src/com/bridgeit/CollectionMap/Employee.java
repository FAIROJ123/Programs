package com.bridgeit.CollectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	private String name;
	private int id;
	private Map departments;
	
   public Employee(String name,int id,Map departments) {
	   this.departments=departments;
	   this.name=name;
	   this.id=id;
	   
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Map getDepartments() {
	return departments;
}

public void setDepartments(Map departments) {
	this.departments = departments;
}

public void display() {
	System.out.println("Name:"+name);
	System.out.println("Id:"+id);
	System.out.println("Deparments are:");
	 Set<Entry<String, String>> set=departments.entrySet(); 
	Iterator<Entry<String, String>> itr=set.iterator();
	while(itr.hasNext()) {
		Entry entry = itr.next();
		System.out.println(entry.getKey()+" department has "+  entry.getValue());
	}
	
}
}
