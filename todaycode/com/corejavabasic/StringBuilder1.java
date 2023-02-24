package com.corejavabasic;

public class StringBuilder1 {

	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder("Tony");
		System.out.println(sb);
		
		//char at index 1
		System.out.println(sb.charAt(1));
		//set char at index 1
//		sb.setCharAt(1,'p');
//		System.out.println(sb);
		
		//Insert
		sb.insert(2, 'n');
		System.out.println(sb);
		
		sb.delete(2, 3);
		System.out.println(sb);
	}

}
