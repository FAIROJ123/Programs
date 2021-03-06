


/* @Purpose:UnOrdered Node Creation..
 
 * @Author:S.Fairoj.
  
 * @Date:23/3/2018
 * */

package com.bridgeit.datastructures;

import java.io.File;

import com.bridgeit.utillity.Util;

public class UnOrderNode 
{
	UnOrderNodeCreation mHead,mTail,mNode,mTemp,mTemp2;
	Util u = new Util();
	File file = new File("/home/bridgeit/Desktop/unorderdList");
	/*
	* This method is used to add data to the linked list
	* @Param data,first parameter for this method.
	**/	
	public <T> void addNode(T value){
		mNode = new UnOrderNodeCreation();
		mNode.setData(value);
		if(mHead == null){
			mHead = mNode;
			mTail = mNode;
		}
		else{
			mTail.setNext(mNode);
			mTail = mNode;
		}	
	}//end of add method
        /*
	* This method is used to update the given file.
	**/
	public void fileUpdate(){
		mTemp = mHead;
		u.clearFile(file);
		int total = 0;
		if(mTemp == null)
			System.out.println("List is Empty");
		else{
			while(mTemp != null){
				total++;
				String str = (String)mTemp.getData();
				u.writeFile(file,str);
				mTemp = mTemp.getNext();
			}
		}
	}//end of fileUpdate
        /*
	* This method is used search the value in the linked list
	* @Param data,first parameter for this method.
	**/
	public <T> void search(T value){
		int count = 0;
		mTemp = mHead;
		while(mTemp != null){
			if(value.equals(mTemp.getData())){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.fileUpdate();
				System.out.println(u.readFile(file));
				System.out.println();
			}
			else
				mTemp = mTemp.getNext();
		}
		if(count == 0){
			System.out.println("Search not found, Element is added");
			this.addNode(value);
			System.out.print("New list is: ");
			this.fileUpdate();
			System.out.println(u.readFile(file));
			System.out.println();
		}
	}//end of search

	/*
	* This method is used to remove data to the linked list
	* @Param data,first parameter for this method.
	**/
	public <T> void remove(T value){
		mTemp = mHead;
		mTemp2 = mTemp.getNext();
		mNode = new UnOrderNodeCreation();
		mNode.setData(value);
		if(value.equals(mHead.getData()))
			mHead = mHead.getNext();
		else{
			while(mTemp2 != null){
				if(value.equals(mTemp2.getData())){
					mTemp.setNext(mTemp2.getNext());
					break;			
				}
				else{
					mTemp = mTemp2;
					mTemp2 = mTemp2.getNext();
				}
			}
		}
}//end of remove method
}
