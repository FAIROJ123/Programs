package com.bridgeit.clinicManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.bridgeit.utillity.Util;
import java.lang.String;

public class DoctorsInfo {

	public String mDocName;
	public String mSpecialization;
	public String mAvailability;
	public String mDate;
	public int mId;
    public int Noofpatients;

	
	
	
	public DoctorsInfo()
	{
		
	}
	public DoctorsInfo(String mDocName, int mId, String mDate,String mSpecialization, String mAvailability,int Noofpatients) {
		this.mDocName = mDocName;
		this.mId = mId;
		this.mSpecialization = mSpecialization;
		this.mAvailability = mAvailability;
		this.Noofpatients= Noofpatients;
		this.mDate=mDate;
	}
	
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public String getmDocName() {
		return mDocName;
	}
	public void setmDocName(String mDocName) {
		this.mDocName = mDocName;
	}
	public String getmSpecialization() {
		return mSpecialization;
	}
	public void setmSpecialization(String mSpecialization) {
		this.mSpecialization = mSpecialization;
	}
	public String getmAvailability() {
		return mAvailability;
	}
	public void setmAvailability(String mAvailability) {
		this.mAvailability = mAvailability;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int getNoofpatients() {
		return Noofpatients;
	}
	public void setNoofpatients(int noofpatients) {
		Noofpatients = noofpatients;
	}
	public String toString() {
		return "\n 1.Name: " + getmDocName() + "\n2.Id: " + getmId() + "\n3.Availability: " + getmAvailability()
                         + "\n4.Date:"+getmDate() +"\n4.Specialization: "+getmSpecialization()+"\n  Noof patients:"+getNoofpatients();
	}
	

	
}
