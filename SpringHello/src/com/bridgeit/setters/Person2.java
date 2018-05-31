package com.bridgeit.setters;

public class Person2 {
private String name;
private int id;
private String desig;

public Person2() {
	// TODO Auto-generated constructor stub
}

public Person2(String name,int id,String desig){
	this.name=name;
	this.id=id;
	this.desig=desig;
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

public String getDesig() {
	return desig;
}

public void setDesig(String desig) {
	this.desig = desig;
}
public void display() {
	System.out.println("name:"+name+",Id:"+id+",Designation"+desig);
}
}
