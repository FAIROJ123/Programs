package com.bridgeit.clinicManagement;

import java.util.ArrayList;

import com.bridgeit.utillity.Util;
import java.lang.String;
public class PatientsInfo 
{
    public String mName;
	public String mMobileNo;
    public int mId;
	public int mAge;
    public String mDocsName;
  
	
	public PatientsInfo(String mName,int mId,String mMobileNo,int mAge){
	this.mName = mName;
	this.mId = mId;
	this.mMobileNo = mMobileNo;
	this.mAge = mAge;
}
	public PatientsInfo()
	{
		
	}
	public String toString() {
		return "\n\n1.Name: " + getmName() + "\n2.Id: " + getmId() + "\n3.Mobilenumber: " + getmMobileNo()
				+ "\n4.Age: " + getmAge();
	}


	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMobileNo() {
		return mMobileNo;
	}
	public void setmMobileNo(String mMobileNo) {
		this.mMobileNo = mMobileNo;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int getmAge() {
		return mAge;
	}
	public void setmAge(int mAge) {
		this.mAge = mAge;
	}
	public String getmDocsName() {
		return mDocsName;
	}
	public void setmDocsName(String mDocsName) {
		this.mDocsName = mDocsName;
	}

}

