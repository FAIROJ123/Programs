

/*

 * @Purpose:Clinique Management Programme.
 * @Author:S.Fairoj
 * @Date:30/13/2018
 * */


package com.bridgeit.objectorientedprograms;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.lang.String;
import java.text.ParseException;

import com.bridgeit.utillity.Util;


public class ClinicalManagement 
{
	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException
	  {
		Util utility = new Util();
		
			boolean check = true;
		do
		{
			
			System.out.println("Enter 1 to add doctor to the file.");
			System.out.println("Enter 2 to add patient to the file");
			System.out.println("Enter 3 to search doctor");
			System.out.println("Enter 4 to search patient");
			System.out.println("ENTER 5 to search doctor by id");
			System.out.println(" Enter 6 to search patient by id");
			System.out.println("Enter 7 to book doctor");
			System.out.println("Enter 8 to exit");
			int option = utility.inputInteger();
			
			switch(option)
			{
			case 1:
				utility.addDoctor("doctors.json");
			break;	
			case 2 :
				utility.addPatient("/home/bridgeit/Desktop/patient.json");
			break;
			case 3 :
				utility.searchdoctor("doctors.json");
			break;
			case 4 :
				utility.searchPatient("/home/bridgeit/Desktop/patient.json");
			break;
			case 5:
				utility.searchdoctorbyId("doctors.json");
			break;
			case 6:
				utility.searchPatientbyId("/home/bridgeit/Desktop/patient.json");
			break;
			case 7:
				JSONObject patients = null;
				System.out.println("Enter the patient id");
				Long patientid =(Long)utility.inputLong();
				JSONObject jsonObjectpatient =utility.readFromFilePatient("/home/bridgeit/Desktop/patient.json");
				JSONArray jsonArraypatient = (JSONArray)jsonObjectpatient.get("patient");
				boolean patientpresent = false;
				for(int i=0;i<jsonArraypatient.size();i++)
				{
					patients = (JSONObject)jsonArraypatient.get(i);
					Long id =(Long)patients.get("id");
					if(id.equals(patientid))
					{
						patientpresent =true;
						break;
					}
				}
				if(patientpresent)
				{
					utility.searchAndbookdoctor(patients);
				}
				else
				{
					System.out.println("you are not registered");
				}
			break;
			case 8 :
				System.exit(0);
			}	
			
		}while(check);
	  }
}
