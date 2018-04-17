package com.bridgeit.clinicManagement;

import java.util.Date;

public class Appointment {

	String mDocName;
	PatientsInfo Patient;
	String mDate;
	

	int mDocId;
	String Appointmenttime;
	
	public Appointment() {

	}


	public int getmDocId() {
		return mDocId;
	}


	public void setmDocId(int mDocId) {
		this.mDocId = mDocId;
	}


	public Appointment(String mDocName, PatientsInfo Patient, String mDate,int mDocId,String Appointmenttime) {
		this.mDocName = mDocName;
		this.Patient = Patient;
        this.mDocId=mDocId;
		this.mDate = mDate;
		this.Appointmenttime=Appointmenttime;
	}

	
	public String getAppointmenttime() {
		return Appointmenttime;
	}


	public void setAppointmenttime(String appointmenttime) {
		Appointmenttime = appointmenttime;
	}


	public String getmDocName() {
		return mDocName;
	}

	public void setmDocName(String mDocName) {
		this.mDocName = mDocName;
	}

	public PatientsInfo getmPatientName() {
		return Patient;
	}

	


	public void setmPatientName(PatientsInfo Patient) {
		this.Patient = Patient;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public String toString() {
		return "\n 1.Name: " + getmDocName() + "\n2.Date: " + getmDate() + "\n3.PatientName:" + getmPatientName();

	}


	
}
