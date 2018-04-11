

/*
 * @Purpose:Enum Singleton
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public enum EnumSingleton
{

    INSTANCE;
    
    public int multiply(int a, int b) {
    	return a * b;
    }
    
    public int add(int a, int b) {
    	return a + b;
    }
    
    EnumSingleton() {
	 
	}
    
    
    public static EnumSingleton doSomething(){
       System.out.println("Hello");
       return INSTANCE;
    }
  
}


