package com.bridgelabz.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {
	
	static Connection con;
	static PreparedStatement ps;

	public int insertUserData(User u) {
		
		int status=0;
		try {
			
			con=ConnectionProvider.getCon();
			ps=con.prepareStatement("insert into User values(?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getPhonenumber());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}

	public User getUser(String username, String password) {
		User u=new User();
		
		try {
			
			con=ConnectionProvider.getCon();
			ps=con.prepareStatement("select * from User where username=? and password=?");
			ps.setString(1,username );
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u.setUsername(rs.getString("userName"));
				u.setPassword(rs.getString("password"));
     			u.setName(rs.getString("name"));
				
				System.out.println("UserName : "+u.getUsername());
				System.out.println("Password : "+u.getPassword());
				System.out.println("Name     : "+u.getName());
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return u;
	}

}
