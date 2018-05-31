package com.bridgeit.SpringExamples;

public class Employee2 {
	private String name;
	private String sal;
	private int id;
	private String designation;
	private String teamleader;
	
//if 2 constructors present in the class then following code is suitable.	
	public Employee2(String name,String sal,int id) {
		this.name=name;
		this.sal=sal;
		this.id=id;
		
	}
	
	public Employee2(String designation,String teamleader)
	{
		this.designation=designation;
		this.teamleader=teamleader;
	}
	
	
	public String toString()
	{
		return "Name:"+name +",Salary:"+sal+",id:"+id + ",designation:"+designation + ",teamleader:"+teamleader;
		
	}

}
