package sreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {

		// create a list and filter all even numbers from list
		
		List<Integer> list1= new ArrayList<>();
		list1.add(12);
		list1.add(54);
		list1.add(23);
		list1.add(233);
		list1.add(13);
		list1.add(78);
		list1.add(67);
		
		
		//new list
		List<Integer> listEven= new ArrayList<>();
//without stream API
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		
		
		System.out.println(list1);
		System.out.println(listEven);
		
		
	//with Stream API
		
		Stream<Integer> stream=list1.stream();
		stream.forEach(e->{
			System.out.println(e);
		});
//		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(newList);
//		List<Integer> listNew =list1.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(listNew);
		List<Integer> listNew1 =list1.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println(listNew1);

	}

}
