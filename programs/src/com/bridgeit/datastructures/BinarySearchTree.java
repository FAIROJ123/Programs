package com.bridgeit.datastructures;

import java.io.File;
import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class BinarySearchTree 
{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		Util u = new Util();
		BinaryTreeMethods tree = new BinaryTreeMethods();
		boolean check = true;
		File file = new File("/home/bridgeit/Desktop/BinarysearchTree.txt");
		String string = u.readFile(file);
		System.out.println("The file elemnts are:"+string);
		string = string.trim();
		
		String[] str = string.split(" ");

		for(int i=0;i<str.length;i++){
			tree.insert(Integer.parseInt(str[i]));
		}

		while(check){
			System.out.println("Please Select Your choice:\n1.Add Element\n2.Total Elements\n3.Possible no. of Combinations\n4.Exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Please Enter Value: ");
					int value = sc.nextInt();
					tree.insert(value);
					break;
				}

				case 2:{
					
					System.out.println("Total Elements:"+tree.getTotal());
					break;	
				}

				case 3:{
					tree.getTreeCount(tree.getTotal());
					break;
				}

				case 4:{
					check = false;
					break;	
				}

				default: {
					System.out.println("Entered Wrong Choice");
				}

			}
		}
	}
}
