package sreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsStream {

	public static void main(String[] args) {


		//filter(Predicate) //boolean value function
		
		
		//map(function)  each element operation

		List<String> names= new ArrayList<String>();
		names.add("Aman");
		names.add("Ankit");
		names.add("Durgesh");
		names.add("Aaqib");
		names.add("Abhinav");
	
	List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		newNames.stream().forEach(System.out::println);
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		System.out.println(set);
		
		//squre of each element
		Set<Integer> s=set.stream().map(e->e*e).collect(Collectors.toSet());
		System.out.println(s);
		s.stream().forEach(e->{
			System.out.println(e);
		});
		
		//sorted
		s.stream().sorted().forEach(System.out::println);
		//min number
		Integer numberss=set.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min :"+numberss);
		Integer numbers=set.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max :"+numbers);
	
	}

}
