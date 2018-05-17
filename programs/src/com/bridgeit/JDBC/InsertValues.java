package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
	public static void main(String[] args) {
		String databaseUrl="jdbc:mysql://localhost:3306/emp_Records";
		String user="root";
		String password="Bridgeit@1";
		Connection con=null;
		Statement stm=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(databaseUrl, user,password);
			 stm=con.createStatement();
			String sql="INSERT INTO employeedetails VALUES('Rossy','Java','Female','1996-07-02')";
			stm.executeUpdate(sql);
			String sql1="INSERT INTO employeedetails VALUES('Saru','QA','Female','2014-08-09')";
			stm.executeUpdate(sql1);
			String sql2="INSERT INTO employeedetails VALUES('Phani','QAE','Male','1990-11-11')";
			stm.executeUpdate(sql2);
			System.out.println("Records successfully added into the table");
			stm.executeUpdate("update employeedetails set NAME='phanikiran' where sex='Male'");
			stm.executeUpdate("delete from employeedetails where name='phanikiran'");
			ResultSet rs=stm.executeQuery("select * from employeedetails");
			while(rs.next())
			{
				String name=rs.getString(1);
				String designation=rs.getString(2);
				String sex=rs.getString(3);
				String DOB=rs.getString(4);
				System.out.println(name+","+designation+","+sex+","+DOB);
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
	  if(stm!=null) 
		  try {
			  con.close();
				System.out.println("connection is closed");
	  }catch(SQLException ex){
			ex.printStackTrace();
		}

       if(con!=null) 
	   try {
		con.close();
		System.out.println("connection is closed");
	}
	catch(SQLException ex){
		ex.printStackTrace();
	}
	
}

System.out.println("Success");
}
}
