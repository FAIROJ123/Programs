/*package com.bridgeit.objectorientedprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		JSONObject obj = new JSONObject();
		System.out.println("enter the wheet name:");
		String name = sc.next();
		System.out.println("enter the wheet cost per kg:");
		int cost = sc.nextInt();
		System.out.println("enter the wheet weight:");
		int weight = sc.nextInt();
		System.out.println("enter the pulses name:");
		String name1 = sc.next();
		System.out.println("enter the pulses cost per kg:");
		int cost1 = sc.nextInt();
		System.out.println("enter the pulses weight:");
		int weight1 = sc.nextInt();
		System.out.println("enter the raice name:");
		String name2 = sc.next();
		System.out.println("enter the raice cost per kg:");
		int cost2 = sc.nextInt();
		System.out.println("enter the raice weight:");
		int weight2 = sc.nextInt();

		obj.put("name", name);
		obj.put("cost", cost);
		obj.put("weight", weight);

		obj.put("name1", name1);
		obj.put("cost1", cost1);
		obj.put("weight1", weight1);

		obj.put("name2", name2);
		obj.put("cost2", cost2);
		obj.put("weight2", weight2);
		JSONArray list = new JSONArray();
		list.add(obj);

		FileWriter file = new FileWriter("/home/bridgeit/Desktop/json.txt");

		try {

			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.flush();
			file.close();
		}

	}

}
*/