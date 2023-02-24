package oops;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Aa {

	static int a=10;
	static int b=89;
	
	int sum(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String args[]) 
    {
      int c=a+b;
      System.out.println(c);
		Aa a1=new Aa();
		System.out.println(a1.sum(12, 12));
    }
	
}
