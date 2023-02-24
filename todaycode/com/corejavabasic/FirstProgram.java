package com.corejavabasic;

import java.util.Scanner;

public class FirstProgram {


	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
//	    Concatenation
//	     System.out.println("Enter first name:");
	     String firstName="maaz";  //sc.next();
//	     System.out.println("Enter last name:");
	     String lastName="maaz";//sc.next();
	     
	     String fullName=firstName+" "+lastName;
	     System.out.println(fullName);
	     
	     //Length()
	     System.out.println(fullName.length());
		
	     //chatAt
	     for(int i=0; i<fullName.length();i++)
	     {
	    	 System.out.println(fullName.charAt(i));
	     }
	     

	     //Compare two string
	     if(firstName.compareTo(lastName)==0) {
	    	 System.out.println("String are Equals");
	     }
	     else
	     {
	    	 System.out.println("String are not equal");
	     }
	     
	     String sentence="my name is one";
	     String n=sentence.substring(5, sentence.length());
	     System.out.println(n);
	     
	     
	     
}
	
}

