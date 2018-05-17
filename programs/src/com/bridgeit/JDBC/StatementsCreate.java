package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementsCreate {
	public static void main(String[] args) {
		String databaseUrl="jdbc:mysql://localhost:3306/emp_Records";
		String user="root";
		String password="Bridgeit@1";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(databaseUrl, user,password);
			Statement stm=con.createStatement();
			//String quary="create table employeedetails(NAME varchar(20), DESIGNATION varchar(10), SEX varchar(10),DOB DATE)";
			//stm.executeUpdate(quary);
			
			System.out.println("Table successfully created");
			
	
	}	catch(ClassNotFoundException ex) {
		System.out.println("Database driver class is not found");
		ex.printStackTrace();
		
	}
    catch(SQLException ex) {
	System.out.println("url/password/username error");
	ex.printStackTrace();
    }
  finally{

       if(con!=null) {
	   try {
		con.close();
		System.out.println("connection is closed");
	}
	catch(SQLException ex){
		ex.printStackTrace();
	}
	
}
}



}

}
