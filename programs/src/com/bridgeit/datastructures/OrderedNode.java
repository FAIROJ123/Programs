




/* @Purpose:Ordered Node Creation..
 
 * @Author:S.Fairoj.
  
 * @Date:24/3/2018
 * */


package com.bridgeit.datastructures;

public class OrderedNode
{
	OrderedNodeCreation mHead=null,mTail,mTemp,mTemp2,mNode;
	/*
	* This method is used to add the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void addNode(int value){
		mNode = new OrderedNodeCreation();
		mNode.setData(value);
		
		if(mHead == null){
			mHead = mNode;
			mTemp = mNode;
			mTail = mNode;
		}
		
		else{
			
			if(value < mHead.getData()){
				mNode.setNext(mHead);
				mHead = mNode;
				mTemp = mHead;
			}
			if(value > mTail.getData()){
				mTail.setNext(mNode);
				mTail = mNode;
			}
			
			if(value > mHead.getData() && value < mTail.getData()){
				boolean condition = true;
				mTemp = mHead;
				while(condition){
					if(value > mTemp.getData() && value < mTemp.getNext().getData()){
						mNode.setNext(mTemp.getNext());
						mTemp.setNext(mNode);
						condition = false;
					}
					else	
						mTemp = mTemp.getNext();
				}
			}
		}
		
	}//end of addNode method

	/*
	* This method is used to display all the linked list elements
	**/
	public void showList(){
		mTemp = mHead;
		int total = 0;
		if(mTemp == null)
			System.out.println("List is Empty");
		else{
			while(mTemp != null){
				total++;
				System.out.print(mTemp.getData()+" ");
				mTemp = mTemp.getNext();
			}
			System.out.println("\nTotal numbers in list: "+total);
		}
	}//end of showList method
		
	/*
	* This method is used to search the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void search(int value){
		int count = 0;
		mTemp = mHead;
		while(mTemp != null){
			if(value == mTemp.getData()){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.showList();
				System.out.println();
			}
			else
				mTemp = mTemp.getNext();
		}
		if(count == 0){
			//System.out.println("Search not found, Element is added");
			this.addNode(value);
			System.out.print("New list is: ");
			this.showList();
			System.out.println();
		}
		
	}//end of search method

	/*
	* This method is used to remove the value to the linked list
	* @Param data,first parameter for this method
	**/
	public void remove(int value){
		mTemp = mHead;
		mTemp2 = mTemp.getNext();
		mNode = new OrderedNodeCreation();
		mNode.setData(value);
		if(value == mHead.getData())
			mHead = mHead.getNext();
		else{
			while(mTemp2 != null){
				if(mNode.getData() == mTemp2.getData()){
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
