



/*
 *  @Purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number.

 * @Author:S.Fairoj.
  
 * @Date:26/3/2018
 * */

package com.bridgeit.datastructures;

import java.io.File;

import com.bridgeit.utillity.Util;

public class HashTable {
	Util u = new Util();
	File file = new File("/home/bridgeit/Desktop/mytext.txt");
	OrderedNodeCreation mHead, mTemp, mEntry;
	int mKey, mValue, mTableSize;
	OrderedNodeCreation[] mTable;

	
	public HashTable(int size) {
		mTableSize = size;
		mTable = new OrderedNodeCreation[mTableSize];
		for (int i = 0; i < mTableSize; i++)
			mTable[i] = null;
	}

	
	public void addValue(int mValue) {
		int mKey = mValue % mTableSize;
		if (mTable[mKey] == null) {
			mTable[mKey] = new OrderedNodeCreation();
			mTable[mKey].setData(mKey);
			mHead = mTable[mKey];
		}
		mHead = mTable[mKey];
		mTemp = mHead;
		mEntry = new OrderedNodeCreation();
		mEntry.setData(mValue);
		while (mTemp.getNext() != null)
			mTemp = mTemp.getNext();
		mTemp.setNext(mEntry);

	}
	public void search(int mValue) {
		int mKey = mValue % mTableSize;
		if (mTable[mKey] == null) {
			System.out.println("Search not Found, number is added");
			this.addValue(mValue);
			this.updateFile();
		} else {
			mHead = mTable[mKey];
			mTemp = mHead.getNext();
			mEntry = new OrderedNodeCreation();
			mEntry.setData(mValue);
			int count = 0;
			while (mTemp != null) {
				if (mEntry.getData() == mTemp.getData()) {
					System.out.println("Search Found, number is Deleted");
					count++;
					this.remove(mValue);
					this.updateFile();
					break;
				} else
					mTemp = mTemp.getNext();
			}
			if (count == 0) {
				System.out.println("Search not found, mValue is added");
				this.addValue(mValue);
				this.updateFile();
			}
		}
	}
	public void remove(int mValue) {
		int mKey = mValue % mTableSize;
		mHead = mTable[mKey];
		mTemp = mHead;
		OrderedNodeCreation mTemp2 = mTemp.getNext();
		while (mTemp2 != null) {
			if (mValue == mTemp2.getData()) {
				mTemp.setNext(mTemp2.getNext());
				break;
			} else {
				mTemp = mTemp2;
				mTemp2 = mTemp2.getNext();
			}
		}

	}

	
	public void updateFile() {
		u.clearFile(file);
		String str;
		for (int i = 0; i < mTableSize; i++) {
			mEntry = mTable[i];
			mTemp = mTable[i];
			if (mTemp == null)
				str = "";
			else {
				mTemp = mTemp.getNext();
				while (mTemp != null) {
					str = Integer.toString(mTemp.getData());
					u.writeFile(file, str);
					mTemp = mTemp.getNext();
				}
			}
		}
		System.out.println("File is Updated");
	}
	public void showTable() {
		for (int i = 0; i < mTableSize; i++) {

			System.out.print("\nmTable " + i + ": ");
			mTemp = mTable[i];
			int total = 0;
			if (mTemp == null)
				System.out.println("List is Empty");
			else {
				mTemp = mTemp.getNext();
				while (mTemp != null) {
					total++;
					System.out.print(mTemp.getData() + " ");
					mTemp = mTemp.getNext();
				}
				System.out.println("\nTotal numbers in list: " + total);
			}
		}

	}
}
