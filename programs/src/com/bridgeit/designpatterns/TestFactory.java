
/*
 * @Purpose:
 * @Autho:
 * @Date:
 * */



package com.bridgeit.designpatterns;

public class TestFactory 
{
	public static void main(String[] args) {
		ComputerFactory cf=new ComputerFactory();
		
		Computer pc = cf.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = cf.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
