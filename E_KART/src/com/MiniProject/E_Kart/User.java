package com.MiniProject.E_Kart;

import java.util.Scanner;

//import java.sql.SQLException;
//import java.util.Scanner;

public class User {

		public void getuserdetails(){
			//user registration
	try	{
		System.out.println("Welcome To The User Section");
		System.out.println("1. New User Registration");
		System.out.println("2. Continue Shopping for Registered User");
		
		Scanner scuser = new Scanner(System.in);
		int userentry = scuser.nextInt();
		
		switch(userentry) {
		
	case 1:
		UserRegistration use = new UserRegistration();
		use.getUserRegister();
		break;
	case 2:
		 ProductRetrival pr = new ProductRetrival();
    	 pr.getProductInfo();
    	 
    	System.out.println("1. To Add Product into Cart");
  		System.out.println("2. To Continue Payment of Previous Transaction");

    	 Scanner scbilling = new Scanner(System.in);
 		int userbilling = scbilling.nextInt();
 
 		switch(userbilling) {
 		 // To Buy the product
 		case 1:
 			Cart cart =new Cart();
 			cart.getBuyproduct();
 			
 			Cart carttotal =new Cart();
 	   		 carttotal.getTotalbillrecipt();
 	   		 System.out.println("*****  Thank Your For Shopping With E-Kart  *****");
 		break;
 		
 		case 2:
   		 // To display cart details & calculate Total price
   		 Cart carttotalbill =new Cart();
   		 carttotalbill.getTotalbillrecipt();
   		 System.out.println("*****  Thank Your For Shopping With E-Kart  *****");
   		 break;
   		
 		}
 		scbilling.close();
	       break; 
	   
       default:
        		System.out.println("Sorry For Inconvinience , System Is Not Responding");
		}
		scuser.close();
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
			
			
			
		}
}
	


