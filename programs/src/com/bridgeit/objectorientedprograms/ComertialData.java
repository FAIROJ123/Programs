

/*
 * @Purpose:Commercial data processing - StockAccount.java implements a data type that might be used by a financial institution to keep track of customer information. The StockAccount class implements following methods
 * @Author:S.Fairoj
 * @Date:28/03/2018
 * */


package com.bridgeit.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.bridgeit.utillity.Util;

public class ComertialData {

	
		public static void main(String[] args)throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
			Util utility = new Util();
			System.out.println("Enter any positive number");
			int choice1 = utility.inputInteger();
			//utility.inputString();
			while (choice1 > 0) {
				System.out.println("enter 1 to add share details to the file");
				System.out.println("enter 2 to delete the share from the file");
				System.out.println("enter 3 to count number of account");
				System.out.println("enter 4 to sell number of share");
				System.out.println("enter 5 to buy number of share ");
				System.out.println("enter 6 to display the json file");
				System.out.println("Enter the choice");
				int choice = utility.inputInteger();
				utility.inputString();
				switch (choice) {
				case 1:

					utility.addtoFile("/home/bridgeit/Desktop/Stockaccount.json");
					break;

				case 2:
					utility.deletetoFile("/home/bridgeit/Desktop/Stockaccount.json");
					break;

				case 3:
					int count1 = utility.numberofrecordofpersons("/home/bridgeit/Desktop/Stockaccount.json");
					System.out.println(count1);

					break;

				case 4:
					System.out.println("enter the number of share to sell");
					int shareToSell = utility.inputInteger();

					utility.sell(shareToSell);
					break;
				case 5:
					System.out.println("enter the number of share to buy");
					int sharetoBuy = utility.inputInteger();
					utility.buy(sharetoBuy);
					break;
				case 6:
					System.out.println("display the json file");
					utility.displaynoshare("/home/bridgeit/Desktop/Stockaccount.json");
					break;
				}

			}
	}

	

}
