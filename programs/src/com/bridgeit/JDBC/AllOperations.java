package com.bridgeit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class AllOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		do {
			System.out.println("which operation do you want to perform:");
			System.out.println("\n1.Insertion\n2.Deletion\n3.Updation\n4.Selection");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				String databaseUrl = "jdbc:mysql://localhost:3306/emp_Records";
				String user = "root";
				String password = "Bridgeit@1";
				Connection con = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(databaseUrl, user, password);
					PreparedStatement ps = con.prepareStatement("insert into friends values(?,?,?)");
					while(true)
					{
					System.out.println("enter employee name:");
					String name = sc.next();
					System.out.println("enter employee designation:");
					String desig = sc.next();
					System.out.println("enter employee sex:");
					String sex = sc.next();
					ps.setString(1, name);
					ps.setString(2, desig);
					ps.setString(3, sex);
					int i = ps.executeUpdate();

					System.out.println(i + "Records successfully added into the table");
					System.out.println("Do you want to add the another record:[yes/No]");
					String option=sc.next();
					if(option.equalsIgnoreCase("No"))
					{
						break;
					}
					}

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
				break;

			case 2:

				String databaseUrl1 = "jdbc:mysql://localhost:3306/emp_Records";
				String user1 = "root";
				String password1 = "Bridgeit@1";
				Connection con1 = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con1 = DriverManager.getConnection(databaseUrl1, user1, password1);
					System.out.println("on which bases u want to delete:");
					System.out.println("1.name\n2.designation");
					System.out.println("enter your choice:");
					int i = sc.nextInt();
					switch (i) {
					case 1:
						System.out.println("enter the friend name to delete");
						String name = sc.next();
						PreparedStatement ps = con1.prepareStatement("delete from friends where name=?");
						ps.setString(1, name);
						int r = ps.executeUpdate();
						System.out.println(r + "deleted from the record");
						break;
					case 2:
						System.out.println("enter designation of friend");
						String desig = sc.next();
						java.sql.PreparedStatement pst = con1
								.prepareStatement("delete from friends where designation=?");
						pst.setString(1, desig);
						int s = pst.executeUpdate();
						System.out.println(s + "deleted from the record");
						break;

					}

				} catch (ClassNotFoundException ex) {
					System.out.println("Database driver class is not found");
					ex.printStackTrace();

				} catch (SQLException ex) {
					System.out.println("url/password/username error");
					ex.printStackTrace();
				} finally {

					if (con1 != null)
						try {
							con1.close();
							System.out.println("connection is closed");
						} catch (SQLException ex) {
							ex.printStackTrace();
						}

				}
				break;
			case 3:

				String databaseUrl2 = "jdbc:mysql://localhost:3306/emp_Records";
				String user2 = "root";
				String password2 = "Bridgeit@1";
				Connection con2 = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con2 = DriverManager.getConnection(databaseUrl2, user2, password2);
					PreparedStatement ps = con2
							.prepareStatement("update friends set designation=? where name=?");
					System.out.println("enter friend name to update designaiton:");
					String name = sc.next();
					System.out.println("enter which designation you want to update");
					String desig = sc.next();
					ps.setString(2, desig);
					ps.setString(1, name);
					ps.executeUpdate();
					System.out.println("updated successfully");

				} catch (ClassNotFoundException ex) {
					System.out.println("Database driver class is not found");
					ex.printStackTrace();

				} catch (SQLException ex) {
					System.out.println("url/password/username error");
					ex.printStackTrace();
				} finally {

					if (con2 != null)
						try {
							con2.close();
							System.out.println("connection is closed");
						} catch (SQLException ex) {
							ex.printStackTrace();
						}

				}
				break;

			case 4:
				String databaseUrl3 = "jdbc:mysql://localhost:3306/emp_Records";
				String user3 = "root";
				String password3 = "Bridgeit@1";
				Connection con3 = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con3 = DriverManager.getConnection(databaseUrl3, user3, password3);
					PreparedStatement ps = con3.prepareStatement("select * from friends");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						String fname = rs.getString(1);
						String fdesig = rs.getString(2);
						String fsex = rs.getString(3);
						System.out.println(fname + "," + fdesig + "," + fsex);

					}

					System.out.println("enter friend name to select infornmation:");
					String name = sc.next();
					PreparedStatement pre = con3.prepareStatement("select * from friends where name=?");
					pre.setString(1, name);
					ResultSet r = pre.executeQuery();
					while (r.next()) {
						String fname = r.getString(1);
						String fdesig = r.getString(2);
						String fsex = r.getString(3);
						System.out.println(fname + "," + fdesig + "," + fsex);

					}
				} catch (ClassNotFoundException ex) {
					System.out.println("Database driver class is not found");
					ex.printStackTrace();

				} catch (SQLException ex) {
					System.out.println("url/password/username error");
					ex.printStackTrace();
				} finally {

					if (con3 != null)
						try {
							con3.close();
							System.out.println("connection is closed");
						} catch (SQLException ex) {
							ex.printStackTrace();
						}

				}
				break;

			}
		} while (status);
	}

}
