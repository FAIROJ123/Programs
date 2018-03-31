

/*
 * @Purpose:Bill Pugh Singleton Implementation
 * @Author:S.Fairoj.
 * @Date:30/03/2017
 * */



//when main class is loading into the memory at that time the inner class is not loaded.
//when some one call the getInstance method then it creates the instance of the singleton.

package com.bridgeit.designpatterns;

public class BillPughSingleton 
{
 private  BillPughSingleton ()
 {
	 
 }
 private static class SingletonHelper
 {
	 private static BillPughSingleton INSTANCE=new BillPughSingleton();
     
	 public static BillPughSingleton getInstance()
	 {
		 return SingletonHelper.INSTANCE;
	 }
 }
}
