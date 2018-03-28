


/*
 *  @Purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number.

 * @Author:S.Fairoj.
  
 * @Date:26/3/2018
 * */


package com.bridgeit.datastructures;

import java.io.File;

import com.bridgeit.utillity.Util;

public class HashingFunction {
	public static void main(String[] args) {
		Util u = new Util();
		boolean check = true;
		System.out.print("Please Enter Table Size:");
		int size = u.inputInteger();
		HashTable ht = new HashTable(size);
		File file = new File("/home/bridgeit/Desktop/mytext.txt");
		String string = u.readFile(file);
		System.out.println("File Contents are: "+string);
		String str[] = string.split(" ");
		for (int i = 0; i < str.length; i++) {
			ht.addValue(Integer.parseInt(str[i]));
		}

		while (check) {
			System.out.println("Please Choose Your Option:\n1.search Value\n2.Show HashTable\n3.Exit");
			int choice = u.inputInteger();
			switch (choice) {
			case 1: {
				System.out.print("Please Enter a value: ");
				int value = u.inputInteger();
				ht.search(value);
				break;
			}
			case 2: {
				System.out.println("Hash table is");
				ht.showTable();
				System.out.println();
				break;
			}
			case 3: {
				check = false;
				break;
			}
			default: {
				System.out.println("Wrong Choice");
				break;
			}

			}
		}
	}
}
