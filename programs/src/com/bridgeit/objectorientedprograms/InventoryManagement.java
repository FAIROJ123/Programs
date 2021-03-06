

/*
 * @Purpose:xtend the above program to Create InventoryManager to manage the Inventory. The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. The InventoryManager will call each Inventory Object in its list to calculate the Inventory Price and then call the Inventory Object to return the JSON String. The main program will be with InventoryManager
 * @Author:S.Fairoj
 * @Date:28/03/2018
 * */

package com.bridgeit.objectorientedprograms;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement 
{
	public static void main(String[] args) {

		int share1, price, value;
		JSONParser parse = new JSONParser();
		try {
			JSONArray jsonArray= (JSONArray) parse.parse(new FileReader("/home/bridgeit/Desktop/StockReport.json"));
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject2 = (JSONObject) jsonArray.get(i);
				String name = (String) jsonObject2.get("Company Name");
				Object share = jsonObject2.get("Shares");
				share1 = Integer.parseInt(share.toString());

				Object price1 = jsonObject2.get("Price");
				price = Integer.parseInt(price1.toString());
				value = (price * share1);
				System.out.println(">>>>>>>>>>>>>Company Name " + name + "<<<<<<<<<<<<<<<<<<");
				System.out.println("Comapny Share is " + share1);
				System.out.println("Company Share Price is " + price);
				System.out.println("Comapnty Total Value of Share is " + value);
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

}
}
