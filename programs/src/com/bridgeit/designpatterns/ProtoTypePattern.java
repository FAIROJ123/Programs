
/*
 * @Purpose:Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. Use Prototype Pattern as shown in the Link above to create multiple Employee Object
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

import java.awt.List;

public class ProtoTypePattern 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List list = empsNew.getEmpList();
		list.add("John");
		List list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
}
