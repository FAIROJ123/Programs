package com.bridgeit.clinicManagement;

public class Appointment {

	String mDocName;
	PatientsInfo Patient;
	String mDate;
	
	public Appointment() {

	}


	public Appointment(String mDocName, PatientsInfo Patient, String mDate) {
		this.mDocName = mDocName;
		this.Patient = Patient;

		this.mDate = mDate;
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
