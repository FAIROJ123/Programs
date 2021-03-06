

/* @Purpose: Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file

 * @Author:S.Fairoj.
  
 * @Date:23/3/2018
 * */


package com.bridgeit.datastructures;

import java.io.File;
import java.util.Scanner;

import com.bridgeit.utillity.Util;


public class UnorderedList
{
	public static void main(String[] args)
	{
		
		Util u = new Util();
		UnOrderNode node = new UnOrderNode();
		File file = new File("/home/bridgeit/Desktop/test.txt");
		String string = u.readFile(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = u.inputString();
		node.search(searchStr);
}
	
}