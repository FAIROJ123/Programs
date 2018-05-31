package com.bridgeit.inheritBean;

public class Employee {

	
	private String name;
	private int id;
	private Engine engine;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name,int id,Engine engine)
	{
		this.name=name;
		this.id=id;
		this.engine=engine;
		
		
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


	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public String toString()
	{
	return "Name:"+name+",Id:"+id+",Engine:"+engine;
	
	}
}
