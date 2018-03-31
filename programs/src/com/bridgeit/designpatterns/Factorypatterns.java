
/*
 * @Purpose:Use Factory Pattern to create a Computer Factory that can Produce PC, Laptop and Server Class Computers. As Shown in the Figure Below Create an Abstract Computer Class and PC, Laptop and Server inherit from Computer and ComputerFactory is able to create the corresponding Computer Object on request
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

public class Factorypatterns 
{
	public static void main(String[] args) {
		ComputerFactory cf=new ComputerFactory ();
		Computer pc = cf.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = cf.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}
