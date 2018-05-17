package com.bridgeit.clinicManagement;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.parser.JSONParser;
import org.omg.Messaging.SyncScopeHelper;

public class ClinicManagement {
	private static PatientsInfo Patient = new PatientsInfo();

	static String mSpecialization;
	static String mAvailability;
	static String mDocName;
	static int mId;
	static int mAge;
	static String mMobileNo;
	static String mDate;
	Scanner sc = new Scanner(System.in);

	static ArrayList<DoctorsInfo> list = new ArrayList<DoctorsInfo>();
	static ArrayList<PatientsInfo> list1 = new ArrayList<PatientsInfo>();
	static ArrayList<Appointment> list2 = new ArrayList<Appointment>();
	static DoctorsInfo doctor = new DoctorsInfo();
	JSONParser parser = new JSONParser();

	static ObjectMapper objectMapper = new ObjectMapper();

	public void operations() throws JsonGenerationException, JsonMappingException, IOException {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {

			System.out.println("Welcome to Clinique Management\n");
			System.out.println("Press the number, you would like to choose!");
			System.out.println("1.Add Doctor\n2.Add Patient\n3.Search Doctor\n4.Search Patient\n5.Take Appointment"
					+ "\n6.Show Patientlist\n7.Show Doctorlist\n8.Show Appointmentlist\n9.Best Doctor in the clinic\n10.Exit\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addDoctor();
				break;
			case 2:
				addPatient();
				break;
			case 3:

				searchDoctor(list);
				break;
			case 4:
				searchPatient(list1);
				break;
			case 5:

				takeAppointment();

				break;
			case 6:
				listOfPatients(list1);
				break;
			case 7:
				listOfDoctors(list);
				break;
			case 8:
				apponitmentList();

				break;
			case 9:
				bestDoctor();
				break;
			case 10:
				break;
			}
		} while (flag);

	}

	public void listOfDoctors(ArrayList<DoctorsInfo> doctors)
			throws JsonParseException, JsonMappingException, IOException {

		File file = new File("/home/bridgeit/Desktop/doctors.json");

		list = new ArrayList(Arrays.asList(objectMapper.readValue(file, DoctorsInfo[].class)));

		System.out.println(list);

	}

	public void listOfPatients(ArrayList<PatientsInfo> patients)
			throws JsonParseException, JsonMappingException, IOException {

		File file = new File("/home/bridgeit/Desktop/patient.json");
		list1 = new ArrayList(Arrays.asList(objectMapper.readValue(file, PatientsInfo[].class)));
		System.out.println(list1);

	}

	public void searchPatient(ArrayList<PatientsInfo> patients) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Name\n2.ID\n3.Mobile Number");
		System.out.println("Enter by which do you want to enter:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("Please enter Name to Search: ");
			String nameSearch = sc.next();
			this.searchName(patients, nameSearch);
			break;
		}
		case 2: {
			System.out.print("Please Enter ID: ");
			int idSearch = sc.nextInt();
			this.searchId(patients, idSearch);
			break;
		}
		case 3: {
			System.out.print("Please Enter Mobile Number for search: ");
			String spSearch = sc.next();
			this.searchByNumber(patients, spSearch);
			break;
		}
		default: {
			System.out.println("Entered Wrong Choice");
		}
		}
	}

	public void printPatient(PatientsInfo patient) {
		System.out.println("\nPatient's Details are:");
		System.out.println("Name : " + patient.mName);
		System.out.println("ID : " + patient.mId);
		System.out.println("MobileNo : " + patient.mMobileNo);
		System.out.println("age : " + patient.mAge + "\n");
	}

	public void searchName(ArrayList<PatientsInfo> patients, String mName) {
		int count = 0;
		for (PatientsInfo patient : patients) {
			if (mName.equals(patient.mName)) {
				this.printPatient(patient);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Patient for given name not found");
	}

	public void searchId(ArrayList<PatientsInfo> patients, int id) {
		int count = 0;
		for (PatientsInfo patient : patients) {
			if (id == patient.mId) {
				this.printPatient(patient);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Patient for given id not found");
	}

	public void searchByNumber(ArrayList<PatientsInfo> patients, String number) {
		int count = 0;
		for (PatientsInfo patient : patients) {
			if (number.equals(patient.mMobileNo)) {
				this.printPatient(patient);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Sorry Patient for given number not found");
	}

	public void searchDoctor(ArrayList doctors) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Name\n2.Id\n3.Specilization\n4.Availability");
		System.out.println("Enter by which do you want to search");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("Please enter Name to Search: ");
			String mNameSearch = sc.next();
			this.searchByName(doctors, mNameSearch);
			break;
		}
		case 2: {
			System.out.print("Please Enter Id: ");
			int mIdSearch = sc.nextInt();
			this.searchById(doctors, mIdSearch);
			break;
		}
		case 3: {
			System.out.print("Please Enter Specilization for search: ");
			String spSearch = sc.next();
			this.searchBySpecilization(doctors, spSearch);
			break;
		}
		case 4: {
			System.out.print("Please Enter Morning or Evening: ");
			String available = sc.next();
			this.searchByAvailability(doctors, available);
			break;
		}
		default: {
			System.out.println("Entered Wrong Choice");
		}
		}
	}

	public void printDoctor(DoctorsInfo d) {
		System.out.println("Name : " + d.mDocName);
		System.out.println("Id : " + d.mId);
		System.out.println("Specialization : " + d.mSpecialization);
		System.out.println("Availability : " + d.mAvailability + "\n");
	}

	public void searchByName(ArrayList<DoctorsInfo> doctors, String mName) {
		int count = 0;
		for (DoctorsInfo doctor : doctors) {
			if (mName.equals(doctor.mDocName)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Doctor for given Name not found");
	}

	public void searchById(ArrayList<DoctorsInfo> doctors, int mId) {
		int count = 0;
		for (DoctorsInfo doctor : doctors) {
			if (mId == doctor.mId) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println(" Doctor for given Id not found");

	}

	public void searchBySpecilization(ArrayList<DoctorsInfo> doctors, String mSpecialization) {
		int count = 0;
		for (DoctorsInfo doctor : doctors) {
			if (mSpecialization.equals(doctor.mSpecialization)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Doctor for given Specialization not found");
	}

	public void searchByAvailability(ArrayList<DoctorsInfo> doctors, String mAvailability) {
		int count = 0;
		for (DoctorsInfo doctor : doctors) {
			if (mAvailability.equals(doctor.mAvailability)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0)
			System.out.println("Doctor for given Availability not found");
	}

	static PatientsInfo addPatient() throws JsonGenerationException, JsonMappingException, IOException {

		try {
			File file = new File("/home/bridgeit/Desktop/patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<PatientsInfo>> type = new TypeReference<ArrayList<PatientsInfo>>() {
				};
				list1 = objectMapper.readValue(arrayToJson, type);

			}
			reader.close();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter patient name:");
			mDocName = sc.next();
			Patient.setmName(mDocName);
			System.out.println("Enter patient id:");
			mId = sc.nextInt();
			Patient.setmId(mId);
			System.out.println("Enter patient mobile number:");
			mMobileNo = sc.next();
			Patient.setmMobileNo(mMobileNo);
			;
			System.out.println("Enter patient age");
			mAge = sc.nextInt();
			Patient.setmAge(mAge);
			list1.add(Patient);
			System.out.println(list1);
			objectMapper.writeValue(file, list1);
			System.out.println("Successfully added patient information");
			System.out.println("\nThere are " + list1.size() + " people in this clinic management.\n");

		} catch (IOException e) {

			e.printStackTrace();
		}
		return Patient;

	}

	static void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {

		try {
			File file = new File("/home/bridgeit/Desktop/doctors.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<DoctorsInfo>> type = new TypeReference<ArrayList<DoctorsInfo>>() {
				};
				list = objectMapper.readValue(arrayToJson, type);

			}
			reader.close();

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter doctor name:");
			mDocName = sc.next();
			doctor.setmDocName(mDocName);
			System.out.println("Enter doctor id:");
			mId = sc.nextInt();
			doctor.setmId(mId);
			System.out.println("Enter doctor specialization:");
			mSpecialization = sc.next();
			doctor.setmSpecialization(mSpecialization);
			System.out.println("Enter doctor Availability time: 1.AM\t2.PM\t Both");
			mAvailability = sc.next();
			doctor.setmAvailability(mAvailability);
			System.out.println("Enter the date:");
			mDate = sc.next();
			//doctor.setmDate(mDate);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date2=null;
			String formatteddated=null;
			
			    //Parsing the String
			    //date2 = dateFormat.parse(mDate);
			    
			        try {
						date2 = dateFormat.parse(mDate);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			       
			    formatteddated = dateFormat.format(date2);
			
			System.out.println(formatteddated);
			doctor.setmDate(formatteddated);
	
			list.add(doctor);
			System.out.println(list);
			objectMapper.writeValue(file, list);
			System.out.println("Successfully added doctors information");
			System.out.println("\nThere are " + list.size() + " people in this clinic management.\n");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void takeAppointment() throws JsonParseException, JsonMappingException, IOException {


		File appoinmentFile = new File("/home/bridgeit/Desktop/Appointment.json");
		try
		{
		BufferedReader reader1 = new BufferedReader(new FileReader(appoinmentFile));
		String arrayToJson1;
		if((arrayToJson1 = reader1.readLine()) != null)
		{
			TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {};
			list2 = objectMapper.readValue(arrayToJson1, type);
			
		}
		PatientsInfo patient = new PatientsInfo();
	
		Scanner sc=new Scanner(System.in);
		Appointment appoinment = new Appointment();
		System.out.println("Enter doctor name to take appoinment ");
		String doctorName = sc.next();
	 
		
		System.out.println("Enter the appoinment date: ");
		String date = sc.next();
		appoinment.setmDate(date);
		
			File file = new File("/home/bridgeit/Desktop/doctors.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<DoctorsInfo>> type = new TypeReference<ArrayList<DoctorsInfo>>() {};
				list = objectMapper.readValue(arrayToJson, type);
				
			}
		
			//System.out.println(list);
			for(int i=0;i<list.size();i++)
			{
				doctor = list.get(i);
				if(doctorName.equals(doctor.getmDocName())&&date.equals(doctor.getmDate()))
				{
				  if(doctor.getNoofpatients()==0)
					{
						
						patient = addPatient();
						doctor.setNoofpatients(1);	
						objectMapper.writeValue(file, list);
						appoinment.setmDocName(doctorName);
						appoinment.setmDate(date);
						appoinment.setmPatientName(patient);
						list2.add(appoinment);
						
						objectMapper.writeValue(appoinmentFile, list2);
					}
					else if(doctor.getNoofpatients()>0 && doctor.getNoofpatients()<5)
					{
				
						patient = addPatient();
						doctor.setNoofpatients(doctor.getNoofpatients()+1);
						objectMapper.writeValue(file, list);
						appoinment.setmPatientName(patient);
						appoinment.setmDate(date);
						list2.add(appoinment);
						objectMapper.writeValue(appoinmentFile, list2);
					}
					else
					{
						System.out.println("Doctor with name="+doctorName+" is Not Available");
						System.out.println("Fix appointment for next day");
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						Calendar c = Calendar.getInstance();
						try{
						   c.setTime(sdf.parse(date));
						}catch(ParseException e){
						   e.printStackTrace();
						 }
						//Incrementing the date by 1 day
						c.add(Calendar.DAY_OF_MONTH, 1);  
						String newDate = sdf.format(c.getTime());  
						System.out.println("Book the appointment for next day: "+newDate);
						patient = addPatient();
						doctor.setNoofpatients(doctor.getNoofpatients()+1);
						objectMapper.writeValue(file, list);
						appoinment.setmPatientName(patient);
						appoinment.setmDate(newDate);
						list2.add(appoinment);
						objectMapper.writeValue(appoinmentFile, list2);
					   
					}
				  
				}
				else
				  {
					  System.out.println("Doctor is not available on this date");
				  }
			
			}	
		
	
		}catch(IOException e)
		
	
		{
		e.printStackTrace();
		}
		

	}

	public void bestDoctor()
	{
		try
		{
			File file = new File("/home/bridgeit/Desktop/doctors.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<DoctorsInfo>> type = new TypeReference<ArrayList<DoctorsInfo>>() {};
				list = objectMapper.readValue(arrayToJson, type);
				
			}
		System.out.println("Popular Doctors are");
		
		Iterator<DoctorsInfo> iterator=list.iterator();
		while(iterator.hasNext())
		{
			doctor=(DoctorsInfo) iterator.next();
			if(doctor.getNoofpatients()==5||doctor.getNoofpatients()<5&&doctor.getNoofpatients()>0)
			{
				System.out.println(doctor);
				String bestSpec=doctor.getmSpecialization();
				System.out.println("Best Specialization in the clinic is:"+bestSpec);
			}
			 
		}
		
	}
		catch(IOException e)
		{
			e.printStackTrace();
}
	}
	public void apponitmentList() {

		Appointment appoinment = new Appointment();
		try {
			File file = new File("/home/bridgeit/Desktop/Appointment.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {
				};
				list2 = objectMapper.readValue(arrayToJson, type);

			}
			for (int i = 0; i < list2.size(); i++) {
				appoinment = list2.get(i);
				System.out.println(appoinment);
				System.out.println(
						"---------------------------------------------------------------------------------------------------------");
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
