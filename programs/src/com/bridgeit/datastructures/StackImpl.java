



/* @Purpose:Stack Implementation .
 
 * @Author:S.Fairoj.
  
 * @Date:24/3/2018
 * */

package com.bridgeit.datastructures;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackImpl
{
   
	
	
	
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    public StackImpl() {
		top=-1;
	}


	public boolean isEmpty()
    {
        return (top < 0);
    }
   
 
    public boolean push(int mStr)
    {
        if (top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = mStr;
            return true;
        }
    }
    public int peek() {
        System.out.println("Peek "+a[top]);
        return a[top];
    }
     
 
    public int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
}
