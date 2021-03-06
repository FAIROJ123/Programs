

/*
 * @Purpose:Using Reflection to destroy Singleton Pattern.
 * @Author:S.Fairoj
 * @Date:30/03/2018.
 * */


package com.bridgeit.designpatterns;

import java.lang.reflect.Constructor;

public class ReflectionSingleton 
{
	
	
	public static void main(String[] args) {
        EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializationSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

	
	
}
