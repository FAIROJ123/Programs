package com.bridgeit.functional;

import java.util.Scanner;


import com.bridgeit.utillity.Util;

public class TwoArray 
{
	private static int row;

	public static void main(String[] args){
		
			Util utility = new Util();
			System.out.println("Enter any choice 1 for integer, 2 for float, 3 for boolean : ");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				utility.numberMatrix();
				break;
			case 2:
				utility.floatMatrix();
				break;
			case 3:
				utility.booleanMatrix();
				break;
			}
	}
		
	}
