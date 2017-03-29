package com.bellinfo.b4.jdbc;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             System.out.println("Provide Login Credentails");
             System.out.println("Provide LoginId");
             String loginId = scan.next();
             System.out.println("Provide Password");
             String password = scan.next();
             
             CRUDRegistrationRepository repo = new CRUDRegistrationRepository();
             repo.getUserDetails(loginId, password);
             
		
	}

}
