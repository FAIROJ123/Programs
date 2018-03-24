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
	/*
	* This method is used to remove the elements from the Rear of the deQueue
	* @return Object,remove the mRear object from the deQueue
	**/
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
	/*
	* This method is used to add the  object to the deQueue from mFront
	* @param Object,This is the first parameter for this method.
	* @return boolean,if the object is added return true else false.
	**/
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
		/*
	* This method is used to add the  object to the deQueue from mRear
	* @param Object,This is the first parameter for this method.
	* @return boolean,if the object is added return true else false.
	**/
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
	/*
	* This method is used to remove the elements from the Rear of the deQueue
	* @return Object,remove the mRear object from the deQueue
	**/
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
	/*
	* This method is used to display all the elements from the deQueue
	**/
	public void display(){
		for(int i=mFront;i<=mRear;i++){
			System.out.print(ob[i]+",");
		}
		System.out.println();
	}
	/*
	* This method is used to fetch the element from the mFront of the deQueue
	* @return Object,fetch the mRear object from the deQueue
	**/
	public Object peek(){
		if(mFront==-1){
		System.out.println("Q is empty");
		return null;
	}
	return ob[mFront];
	}
	/*
	* This method is used to know the size of the deQueue
	* @return int,size of the deQueue
	**/
	public int getSize(){
		return mRear-mFront+1;
	}
	/*
	* This method is used know wheather the deQueue is empty or not
	* @return boolean,true if the deQueue is empty else false
	**/
	public boolean isEmpty(){
	if(mRear == -1)
		return true;
	else
		return false;
}
}
