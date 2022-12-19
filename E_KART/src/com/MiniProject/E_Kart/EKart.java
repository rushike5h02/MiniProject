package com.MiniProject.E_Kart;

//import java.sql.SQLException;
import java.util.Scanner;

public class EKart {

	public void ekart()  {
		System.out.println("***** Welcome to The E-Kart *****");
		System.out.println();
		System.out.println("1. User Login");
		System.out.println();
		System.out.println("2. Admin Login");
		System.out.println();
		
		Scanner scchoice = new Scanner(System.in);
		int choice = scchoice.nextInt();

		if(choice==1) {
			
			User user = new User();
			user.getuserdetails();
			
		}
		else if(choice==2) {
			
			Admin admin = new Admin();
			admin.adminmethod();
			
			
		}
		else {
			System.out.println("Sorry For Inconvinience , System Is Not Responding");
		}
		scchoice.close();	
	}
	
	public static void main(String []args) {
		
		EKart ekartmain = new EKart();
		ekartmain.ekart();
	}
	
}
