
/*
 * @Purpose:Eager initialization
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

public class EagerInitializationSingleton 
{
 
	public static final EagerInitializationSingleton  instance =new EagerInitializationSingleton();
	
	private EagerInitializationSingleton()
	{
		
	}
	
public static EagerInitializationSingleton getInstance()
{
	return instance;
}

}
