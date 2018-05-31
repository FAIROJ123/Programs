package com.bridgeit.CollectionInjection;

public class NoStringExam {
	private String name;
	private int id;
	private String filename;
	
	public NoStringExam(String name,int id,String filename)
	{
		this.name=name;
		this.id=id;
		this.filename=filename;
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

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
   public String toString() {
	   return "Name:"+name+",Id:"+id+"Filename:"+filename;
   }
}
