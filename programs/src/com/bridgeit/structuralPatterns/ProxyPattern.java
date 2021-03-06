


 
/*
 * @Purpose:Proxy design pattern.
 * @Author:S.Fairoj
 * @Date:31/03/2018.
 * */
package com.bridgeit.structuralPatterns;

public class ProxyPattern 
{
	public static void main(String[] args){
		CommandExecutorProxy executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
