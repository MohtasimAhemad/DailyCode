package sreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamP1 {

	public static void main(String[] args) {


		List<String> l = new ArrayList<String>();
		l.add("Apple");
		l.add("Mango");
		l.add("Banana");
		l.add("Watermilon");
		l.add("Blueberry");
		l.add("Orange");
		l.add("Pineapple");
		l.add("Papaya");
		l.add("Ramphal");
		l.add("Strawberries");
		
		List<String> newList=l.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
		newList.stream().forEach(e->
		{
			System.out.println(e);
		});
		
	
		
//		l.stream().forEach(e->{
//			System.out.println(e);
//		});
				
	}

}
