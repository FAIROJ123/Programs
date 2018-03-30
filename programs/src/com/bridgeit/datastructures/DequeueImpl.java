


/* @Purpose:Dequeue implementation.
 
 * @Author:S.Fairoj.
  
 * @Date:25/3/2018
 * */

package com.bridgeit.datastructures;

public class DequeueImpl 
{
	Object ob[];
	int mRear,mFront,mCpy;
	DequeueImpl (){
		ob=new Object[10];
		mRear=mFront=-1;
		mCpy=5;
	}
	
	public Object removeRear(){
		if(mRear==-1 && mFront==-1){
		System.out.println("Queue is empty");
		return null;
		}
		else{
		Object obj = ob[mRear];
		mRear--;
		return obj;
		}
		
	}
	
	public boolean addFront(Object obj){
	     if(mRear==-1){
			mFront++;
			mRear++;
			ob[mRear]=obj;
		        return true;
		}
		for(int i=mRear;i!=-1;i--){
			ob[i+1]=ob[i];
			}
			mRear++;
			ob[mFront]=obj;
			return true;
		}
		
	public boolean addRear(Object obj){
		if(mRear==-1){
			mFront++;
			mRear++;
			ob[mRear]=obj;
		        return true;
		}
		else if(mRear<mCpy-1){
			mRear++;
			ob[mRear]=obj;
			return true;
		}
		else{
			mCpy=mCpy+5;
			Object nob[]=new Object[mCpy];
			for(int i=0;i<ob.length;i++){
				nob[i]=ob[i];
			}
			ob=nob;
			mRear++;
			ob[mRear]=obj;
			return true;
		}
	}	
	
	public Object removeFront(){
		if(mFront==-1){
			System.out.println("Q is empty");
			return null;
		}
		else{
			Object obj=ob[mFront];
			mFront++;
			if(mFront>mRear)
			mFront=mRear=-1;
			return obj;
		}
	}
	
	public void display(){
		for(int i=mFront;i<=mRear;i++){
			System.out.print(ob[i]+",");
		}
		System.out.println();
	}
	
	public Object peek(){
		if(mFront==-1){
		System.out.println("Q is empty");
		return null;
	}
	return ob[mFront];
	}
	
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
