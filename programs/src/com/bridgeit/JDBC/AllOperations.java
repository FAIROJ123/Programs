package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AllOperations {

	

	public static void insertion() throws SQLException {
		String databaseUrl = "jdbc:mysql://localhost:3306/emp_Records";
		String user = "root";
		String password = "Bridgeit@1";
		Connection con = null;
		Statement stm = null;
		Employee emp = new Employee();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(databaseUrl, user, password);
			stm = con.createStatement();
			String sql = "INSERT INTO employeedetails(NAME,DESIGNATION,SEX,DOB) VALUES('" + emp.getName() + "','"
					+ emp.getDesignation() + "','" + emp.getSex() + "','" + emp.getDOB() + "')";
			stm.executeUpdate(sql);
			System.out.println("Records successfully added into the table");

			ResultSet rs = stm.executeQuery("select * from employeedetails");
			while (rs.next()) {
				String name = rs.getString(1);
				String designation = rs.getString(2);
				String sex = rs.getString(3);
				String DOB = rs.getString(4);
				System.out.println(name + "," + designation + "," + sex + "," + DOB);
			}
		
		} catch (ClassNotFoundException ex) {
			System.out.println("Database driver class is not found");
			ex.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("url/password/username error");
			ex.printStackTrace();
		} finally {
			if (stm != null)
				try {
					con.close();
					System.out.println("connection is closed");
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			if (con != null)
				try {
					con.close();
					System.out.println("connection is closed");
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

		}

		System.out.println("Success");

	}

		
		
		

		
	
//-------------------------------------------------------------------------------------------
	
	
	public static void deletion() throws SQLException {
		
		String databaseUrl = "jdbc:mysql://localhost:3306/emp_Records";
		String user = "root";
		String password = "Bridgeit@1";
		Connection con = null;
		Statement stm = null;
		Employee emp = new Employee();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(databaseUrl, user, password);
			stm = con.createStatement();
			stm.executeUpdate("delete from employeedetails where NAME='" + emp.getName() + "'");
			System.out.println(emp.getName() + "record is deleted from the table");

			
		
		} catch (ClassNotFoundException ex) {
			System.out.println("Database driver class is not found");
			ex.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("url/password/username error");
			ex.printStackTrace();
		} finally {
			if (stm != null)
				try {
					con.close();
					System.out.println("connection is closed");
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			if (con != null)
				try {
					con.close();
					System.out.println("connection is closed");
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

		}

		System.out.println("Success");

	}

		
		
		
		
	

	//date of birth doubt tmr i will ask to swetha
	
//--------------------------------------------------------------------------------------------	
	
	
	public static void main(String[] args) throws SQLException {

		

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("which operation do you want to perform:");
		System.out.println("1.Insertion\n2.Deletion\n 3.Updation\n 4.Selection");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter employee name:");
			emp.setName(sc.next());
			System.out.println("enter Employee designation:");
			emp.setDesignation(sc.next());
			System.out.println("enter Employee sex:");
			emp.setSex(sc.next());
			System.out.println("enter Employee date of birth:");
			emp.setDOB(sc.next());
			insertion();
			   
		case 2:
			
			System.out.println("enter the name of the employee which do you want to delete:");
			emp.setName(sc.next());
			deletion();
			
			  
			  
		
			
		}
	}

		
		
}
