package com.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortwithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = new ArrayList<>();
		
		num.add(908);
		num.add(665);
		num.add(12);
		num.add(1);
		num.add(56);
		num.add(1023);
		
		System.out.println("Numbers :"+num);
		
//		num.sort(new Comparator<Integer>()
//				{
//
//					@Override
//					public int compare(Integer num1, Integer num2) {
//						return num1.compareTo(num2);
//					}
//			
//				});
		
		
		
//		num.sort((num1,num2)->num1.compareTo(num2));
		
		
		num.sort(Comparator.naturalOrder());
		
		
		
		System.out.println("Sorted Numbers : "+num);
		
		
		
	}

}
