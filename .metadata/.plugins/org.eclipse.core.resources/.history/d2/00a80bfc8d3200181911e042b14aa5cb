package com.bridgeit.datastructures;

import java.util.LinkedList;

import com.bridgeit.utillity.Util;

public class primeAnagramQueue 
{
public static void main(String[] args)
{
 int start=1;
 int end=1000;
 Util util=new Util();
 LinkedList<Integer> list=util.primeNumber(start,end);
 LinkedList<String> list2=new LinkedList<String>();
 System.out.println("prime anagram numbers are:");
 for(int i=0;i<list.size();i++)
 {
	 for(int j=i+1;j<list.size();j++)
	 {
		 if(list.get(i)!=null)
		 {
			 if(util.anagramNum(list.get(i), list.get(j)))
			 {
				 list2.add(list.get(i)+" "+list.get(j));
				 
			 }
		 }
	 }
 }
 QueueAnagramImpl<String> queue=new QueueAnagramImpl<String>();
 for(int i=0;i<list2.size();i++)
 {
	 queue.enqueue(list2.get(i));
 
 }
 queue.getelement();
}

 
	 
 
 

}
