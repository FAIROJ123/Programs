package com.bridgelabz.Registration;

public interface UserDAO {
	
	public int insertUserData(User u);
	
	public User getUser(String username,String password); 

}
