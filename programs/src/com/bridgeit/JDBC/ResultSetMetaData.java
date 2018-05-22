package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ResultSetMetaData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String databaseUrl = "jdbc:mysql://localhost:3306/emp_Records";
		String user = "root";
		String password = "Bridgeit@1";
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(databaseUrl, user, password);
			java.sql.PreparedStatement ps = con.prepareStatement("select * from friends");
			ResultSet rs = ps.executeQuery();
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total number of columns:" + rsmd.getColumnCount());
			System.out.println("column name of 2 column:" + rsmd.getColumnName(2));
			System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
			System.out.println("Table Name:"+rsmd.getTableName(2));

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
