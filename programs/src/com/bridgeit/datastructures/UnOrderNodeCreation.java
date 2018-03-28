


/* @Purpose:UnOrdered Node Creation..
 
 * @Author:S.Fairoj.
  
 * @Date:23/3/2018
 * */

package com.bridgeit.datastructures;

public class UnOrderNodeCreation<T> 
{
	T mData;
	UnOrderNodeCreation mNext;
	//Assigning the data value
	public void setData(T value){
		mData = value;
	}
	//getting data value
	public T getData(){
		return mData;
	}
	//Assigning next node
	public void setNext(UnOrderNodeCreation node){
		mNext = node;
	}
	//getting next node
	public UnOrderNodeCreation getNext(){
		return mNext;
}
}
