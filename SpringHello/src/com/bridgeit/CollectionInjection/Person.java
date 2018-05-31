package com.bridgeit.CollectionInjection;

import java.util.Iterator;
import java.util.List;


public class Person {

	private String name;
    private int id;
    private List<String> files;
    private List filenames;
    
    public List getFilenames() {
		return filenames;
	}

	public void setFilenames(List filenames) {
		this.filenames = filenames;
	}

	public Person(String name,int id,List files,List filenames) {
    	this.name=name;
    	this.id=id;
    	this.files=files;
    	this.filenames=filenames;
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

	public List<String> getFiles() {
		return files;
	}

	public void setFiles(List<String> files) {
		this.files = files;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("List of files are:");
		Iterator it=files.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("List of file names are:");
		Iterator itr=filenames.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	
}
