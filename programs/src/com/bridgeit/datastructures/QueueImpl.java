

/* @Purpose:Queue Implementation.
 
 * @Author:S.Fairoj.
  
 * @Date:26/3/2018
 * */


package com.bridgeit.datastructures;

import java.util.NoSuchElementException;

public class QueueImpl {
	Object mOb[];
	int mRear,mFront,mCpy;
	
	public QueueImpl(){
		mOb=new Object[10];
		mRear=mFront=-1;
		mCpy=5;
	}
	
	QueueImpl(int mCpy){
		this.mCpy=mCpy;
		mRear=mFront=-1;
		mOb=new Object[mCpy];
	}
	
	
	public boolean enQueue(Object obj){
		if(mRear==-1){
			mFront++;
			mRear++;
			mOb[mRear]=obj;
		        return true;
		}
		else if(mRear<mCpy-1){
			mRear++;
			mOb[mRear]=obj;
			return true;
		}
		else{
			mCpy=mCpy+5;
			Object nOb[]=new Object[mCpy];
			for(int i=0;i<mOb.length;i++){
				nOb[i]=mOb[i];
			}
			mOb=nOb;
			mRear++;
			mOb[mRear]=obj;
			return true;
		}
	}
	
	public Object deQueue(){
		if(mFront==-1){
			System.out.println("Q is empty");
			return null;
		}
		else{
			Object obj=mOb[mFront];
			mFront++;
			if(mFront>mRear)
			mFront=mRear=-1;
			return obj;
		}
	}
	/*
	* This method display all the queue elements.
	**/
	public void display(){
		for(int i=mFront;i<=mRear;i++){
			System.out.print(mOb[i]+",");
		}
		System.out.println();
	}
	
	public Object peek(){
		if(mFront==-1){
		System.out.println("Q is empty");
		return null;
	}
	return mOb[mFront];
	}
	/*This method displays the size of the queue.
	* @return int,size of the queue
	**/
	public int getSize(){
		return mRear-mFront+1;
	}
	
	public boolean isEmpty(){
	if(mRear == -1)
		return true;
	else
		return false;
}
	
}