package com.bellinfo.b4.jdbc;

import java.sql.*;
import java.util.Scanner;

public class RegisterDemo {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UserInfo info = new UserInfo();
		
		System.out.println("Enter Fullname:");
		String fullname=  scan.next();
		System.out.println("Enter Email:");
		String email=  scan.next();
		System.out.println("Enter LoginId:");
		String loginId=  scan.next();
		System.out.println("Enter Password:");
		String password=  scan.next();
		
		info.setFullname(fullname);
		info.setEmail(email);
		info.setLoginID(loginId);
		info.setPassword(password);
		
		CRUDRegistrationRepository register = new CRUDRegistrationRepository();
		register.getConnection();
		register.createRegistration();
		register.saveRegistraionDetails(info);
		
		register.updateEmail("xyz123@gmail.com", "abcd");
		
	}
		
		/*
		try {
			
     		//Create a stmt
			Statement stmt = con.createStatement();
		//Prepare the query & execute the result
			String selectQuery = "select * from register where username='bellinfo'";
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()){
				String name = rs.getString("fullname");
				String loginId = rs.getString("username");
				String email = rs.getString("email");
				String pass = rs.getString("password");
				System.out.println("name "+name+" email "+email+" loginId "+ loginId+" password "+pass);
			}
			
		//close the connection
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	

}


