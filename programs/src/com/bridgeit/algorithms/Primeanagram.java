package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Primeanagram
{
    public static void main(String[] args)
    {
    	Util util=new Util();
		Scanner sc=new Scanner(System.in);
		int[] arr= {2, 3 ,5, 7, 11, 13, 17, 19, 23, 29, 31, 37  };
		int n=arr.length-1;
		for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (arr[i]== arr[j])
                {
                    System.out.println(arr[i] +  " is anagram of " + arr[j]);
    }
    }
		
    }

