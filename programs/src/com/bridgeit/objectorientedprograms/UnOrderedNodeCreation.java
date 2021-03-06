package com.bridgeit.objectorientedprograms;

import com.bridgeit.datastructures.UnOrderNodeCreation;

public class UnOrderedNodeCreation<T> 
{
	T mData;
	UnOrderedNodeCreation mNext;
	
	public void setData(T value){
		mData = value;
	}
	
	public T getData(){
		return mData;
	}
	
	public void setNext(UnOrderedNodeCreation mEntry){
		mNext = mEntry;
	}
	
	public UnOrderedNodeCreation getNext(){
		return mNext;
}
	
}
