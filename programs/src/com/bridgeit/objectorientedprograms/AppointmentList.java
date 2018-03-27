package com.bridgeit.objectorientedprograms;

import com.bridgeit.datastructures.UnOrderNodeCreation;

public class AppointmentList 
{
	String[] mDocsNames = {"Dr. ABC","Dr. XYZ","Dr. DEF","Dr. GHI","Dr. JKL"};
	int mId;
	UnOrderedNodeCreation[] mTable = new UnOrderedNodeCreation[5];
	UnOrderedNodeCreation mHead ;
	UnOrderedNodeCreation mEntry;
	UnOrderedNodeCreation mTemp;

	
	public void ArrangeAppointment(){
		for (int i = 0; i <5; i++)
			mTable[i] = null;
	}

	
	public void takeAppoinment(PatientsInfo patient,int mId){
		try{
			this.mId = mId;
			int num = mId-1;
			int count = 1;
			if(mTable[num] == null){
				mTable[num] = new UnOrderedNodeCreation();
				mTable[num].setData(mDocsNames[num]);
				mHead = mTable[num];
				;
			}
			mHead = mTable[num];
			mTemp = mHead;

			
			while(mTemp.getNext() != null){
				mTemp = mTemp.getNext();
				count++;
			}	

				if(count<=5){
				mHead = mTable[num];
				mTemp = mHead;
				mEntry = new UnOrderedNodeCreation();
				mEntry.setData(patient);
				//System.out.println("Appointment successfull for "+mDocsNames[num]);
				while(mTemp.getNext() != null){
					mTemp = mTemp.getNext();
				}
					mTemp.setNext(mEntry);
			}

			else{
				System.out.println("Sorry Todays Appointment for "+mDocsNames[num]+" is not available ");
			}
				
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Doctor's ID is Wrong!!");
		}

	}
	
	public void showAppointments(){
		for(int i=0;i<5;i++){
			System.out.print("\n"+mDocsNames[i]+": ");
			mTemp = mTable[i];
			int total = 0;
			if(mTemp == null)
				System.out.println(" \nTotal Patients: "+total);
			
			else{
				mTemp = mTemp.getNext();
				while(mTemp != null){
						total++;
						System.out.print(((PatientsInfo)mTemp.getData()).mDocsName+", ");
						mTemp = mTemp.getNext();
				}
				System.out.println("\nTotal patients: "+total);
			}
		}
}//end of showTable
}
