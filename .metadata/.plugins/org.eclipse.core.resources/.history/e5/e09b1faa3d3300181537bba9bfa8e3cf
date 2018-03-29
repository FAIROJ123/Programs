package com.bridgeit.functional;

import java.util.Scanner;


import com.bridgeit.utillity.Util;

public class TwoArray 
{
	private static int row;

	public static void main(String[] args){
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Interger Array \n 2.Double Array \n 3.Boolean Array \n 4.Exit");
		System.out.println("Enter the option which array you want to create:");
		int option=sc.nextInt();
		
		
		switch(option)
		{
			case 1:
				{
					System.out.println("Enter the number of rows");
					 int row=sc.nextInt();
					System.out.println("Enter the number of column");
					int col=sc.nextInt();
				    Integer arr[][]=new Integer[row][col];
					System.out.println("Enter the array elements");
					for(int i=0;i<row;i++)
					{
						for(int j=0;j<col;j++)
						{
							arr[i][j]=sc.nextInt();
							
						}
						
					}
			util.display(row,col);
			    break;
               }	
	
           case 2:
           		{
           			System.out.println("Enter the number of rows");
					int row=sc.nextInt();
					System.out.println("Enter the number of columns");
					int col=sc.nextInt();
					Double[][] arr=new Double[row][col];
					System.out.println("Enter the array elements");
					for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){
							arr[i][j]=sc.nextDouble();
							
							}
						
					}
					
					util.display(row, col);
				    	
				    	break;
                }	
           case 3:
           		{	
					System.out.println("Enter the number of rows");
					
					int row=sc.nextInt();
					System.out.println("Enter the number of columns");
					
					int col=sc.nextInt();
					
					Boolean[][] arr=new Boolean[row][col];
					System.out.println("Enter the array elements");				  
		 			System.out.println("Enter the array elements");
		 			
					for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){
							arr[i][j]=sc.nextBoolean();
							
							}
						
					 }
					util.display(row, col);
		      		 break;
				}
			case 4:
				 {
				    break;
				 }
		}
		
		
	}
}