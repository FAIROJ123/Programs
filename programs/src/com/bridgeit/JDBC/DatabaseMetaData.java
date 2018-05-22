package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseMetaData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String databaseUrl = "jdbc:mysql://localhost:3306/emp_Records";
		String user = "root";
		String password = "Bridgeit@1";
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(databaseUrl, user, password);
			java.sql.DatabaseMetaData dbmd=con.getMetaData(); 

			System.out.println("Driver name:" + dbmd.getDriverName());
			System.out.println("Driver Version:" + dbmd.getDriverVersion());
			System.out.println("Database product name: " + dbmd.getDatabaseProductName());
			System.out.println("Product version:"+dbmd.getDatabaseProductVersion());
			System.out.println("UserName: "+dbmd.getUserName());
			

		} catch (ClassNotFoundException ex) {
			System.out.println("Database driver class is not found");
			ex.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("url/password/username error");
			ex.printStackTrace();
		} finally {

			if (con != null)
				try {
					con.close();
					System.out.println("connection is closed");
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

		}
	}
	

}
