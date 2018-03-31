

/*
 * @Purpose:Static block initialization.
 *@Author:S.Fairoj
 * @Date:30/03/2018.
 * */

package com.bridgeit.designpatterns;

public class StaticblockSinglton {
	private static StaticblockSinglton instance;

	private StaticblockSinglton() {
	}

	static {
		try {
			instance = new StaticblockSinglton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticblockSinglton getInstance() {
		return instance;
	}

}
