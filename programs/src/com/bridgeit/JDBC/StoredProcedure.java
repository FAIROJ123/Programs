package com.bridgeit.JDBC;
import java.sql.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedure {
	public static void main(String[] args) {
		String databaseUrl="jdbc:mysql://localhost:3306/emp_Records";
		String user="root";
		String password="Bridgeit@1";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(databaseUrl, user,password);
			CallableStatement stm=con.prepareCall("{call addProc(?,?,?)}");
			stm.setString(1, "Fairoj");
			stm.setString(2, "java");
			stm.setString(3,"f");
			stm.execute();
			if(con!=null) {
				System.out.println("connected to the database");
			}
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
