package com.arraylist;

import java.util.ArrayList;

public class AddElementToSpecifiedIndexArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //create an ArrayList object
	    ArrayList arrayList = new ArrayList();
	   
	    //Add elements to Arraylist
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	   
	    /*
	      To add an element at the specified index of ArrayList use
	      void add(int index, Object obj) method.
	      This method inserts the specified element at the specified index in the
	      ArrayList.  
	    */
	    arrayList.add(1,"INSERTED ELEMENT");
	   
	    /*
	      Please note that add method DOES NOT overwrites the element previously
	      at the specified index in the list. It shifts the elements to right side
	      and increasing the list size by 1.
	    */
	 
	    System.out.println("ArrayList contains...");
	    //display elements of ArrayList
	    for(int index=0; index < arrayList.size(); index++)
	      System.out.println(arrayList.get(index));
	}

}
   

          


