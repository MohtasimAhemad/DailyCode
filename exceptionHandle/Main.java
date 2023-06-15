package exceptionHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class AgeInvalidException extends Exception
{
	AgeInvalidException()
	{
		super("age is invalid !");
	}
	AgeInvalidException(String message)
	{
		super();
	}
}
class Main {
	
	  public static void main(String[] args) {
	   try
	   {
		   System.out.println("Started.....");
		    int n1=0;
		    int n2=20;
		    System.out.println("We have got two numbers..");
		    int result=n1/n2;
		    System.out.println("Division is :"+result);
		    if(n2<10)
		    
		    {	throw new AgeInvalidException("My age is invalid ");
		    }}
		    catch(AgeInvalidException e)
		    {
		    	System.out.println("Invalid .....");
		    }
	   catch(Exception e)
	   {
		   System.out.println("invalid");
		   System.out.println(e.getMessage());
	   }
//	   catch(ArithmeticException e)
//	   {
//		   System.out.println("n2 can not be 0!!");
//		   System.out.println(e.getMessage());
//	   }
//	   catch(NumberFormatException e)
//	   {
//		   System.out.println("Invalid Number!!");
//		   System.out.println(e.getMessage());
//	   }
	    System.out.println("Terminated..");
		  
	  }
	}