package com.bridgeit.objectorientedprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.security.KeyStore.Entry;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.crypto.Data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeit.utillity.Util;

public class Person implements Comparable {

	private String firstName;
	private String lastName;

	private String city;
	private String state;
	private String zip;
	private String phone;

	public Person() {

	}

	public Person(String firstName, String lastName, String city, String state, String zip, String phone) {

		this.firstName = firstName;
		this.lastName = lastName;

		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;

	}

	public String getfirstName() {
		return this.firstName;
	}

	public void setfirstName() {
		this.firstName = firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public void setlastName() {
		this.lastName = lastName;
	}

	public String getcity() {
		return this.city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getstate() {
		return this.state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getzip() {
		return this.zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "\n\nfirstName: " + getfirstName() + "\nlastname: " + getlastName() + "\nPhone: " + getPhone()
				+ "\ncity: " + getcity() + "\nstate: " + getstate() + "\nzip: " + getzip();
	}

	
	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		return this.lastName.compareToIgnoreCase(((Person) other).lastName);

	}

	
	

	
	
}
