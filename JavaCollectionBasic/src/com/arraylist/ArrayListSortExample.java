package com.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		
		names.add("Roshan");
		names.add("Payal");
		names.add("Chetan");
		names.add("Zaid");
		
		System.out.println("names :"+ names);
		
        // Sort an ArrayList using its sort() method. 
//		You must pass a Comparator to the ArrayList.sort() method.
	/*, String n2) {
			return n1.compareTo(n2);	
		names.sort(new Comparator<String>()
	{

		@Override
		public int compare(String n1
		}
			
	});*/
		
        // The above `sort()` method call can also be written simply using lambda expression
		
		names.sort((n1,n2)-> n1.compareTo(n2));
		
		
        // Following is an even more concise solution
		names.sort(Comparator.naturalOrder());
		
		
		System.out.println("Sorted Name : "+names);
		
	}

} 
                
