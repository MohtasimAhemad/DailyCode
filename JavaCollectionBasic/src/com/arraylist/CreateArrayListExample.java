package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

	public static void main(String[] args) {

		List<String> animals= new ArrayList<String>();
		
		
		//adding elements to Arraylist
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println(animals);
		
		//adding elements on a particular index
		
		animals.add(2, "Elephant");
		System.out.println(animals);
	}

}
