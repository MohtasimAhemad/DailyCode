package com.basicstrong.List;


import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
 
	public static void main(String[] args) {
		
		//assigning treeSet object to navigableSet reference
		NavigableSet<Integer> data = new TreeSet<Integer>();
		
		//adding elements
		data.add(2000);
		data.add(4000);
		data.add(15000);
		data.add(50000);
		data.add(58000);
		System.out.println("---- Tree Set ----");
		System.out.println(data);
		System.out.println("-----------------------------------------");
		
		//Methods
		
		System.out.println(data.floor(14550)); 
		
		System.out.println(data.lower(14000)); 
		
		System.out.println(data.ceiling(2500)); 
		
		System.out.println(data.higher(5000)); 
		
		System.out.println(data.pollFirst()); 
		
		System.out.println(data.pollLast());
		
		System.out.println(data.descendingSet());
	}
}