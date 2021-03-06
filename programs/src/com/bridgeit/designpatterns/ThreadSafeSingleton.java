

/*
 * @Purpose:Thread Safe Singleton.
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

public class ThreadSafeSingleton 
{
  private static ThreadSafeSingleton instance;
  
  private ThreadSafeSingleton()

    {
	  }
  public static synchronized ThreadSafeSingleton getInstance()
  {
	  if(instance==null)
	  {
		instance=new ThreadSafeSingleton();  
	  }
	  return instance;
	  }


//The above implementation is thread Safety.
//But it reduces the performance because cost assosiated.
//To avoid this problem we can use DoublecheckedLocking principle.



public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
{
	if(instance==null)
	{
		synchronized(ThreadSafeSingleton.class)
		{
			if(instance==null)
			{
				instance= new ThreadSafeSingleton();
			}
			
		}
	
	}
	return instance;
}
}