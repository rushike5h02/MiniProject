package com.MiniProject.E_Kart;

//import java.sql.SQLException;
import java.util.Scanner;

public class ReturnEcomerse {
	
	public void getReturnEcomerse() {
		 
	try {	
		Scanner s=new Scanner(System.in);
	         EKart e=new EKart();
	         System.out.println("press '1'  to continue and to close the shop enter '2' button");
	         int enter =s.nextInt();
	        if(enter==1) {
	        e.ekart();
	        }
	        //Exit
	        else if(enter==2){
	        	 System.out.println("************ Thank you for visiting E-Cart*****************");
	        }
	        s.close();
	}catch (Exception e) {
		System.out.println(e);
	}
	
	        
	}

}
