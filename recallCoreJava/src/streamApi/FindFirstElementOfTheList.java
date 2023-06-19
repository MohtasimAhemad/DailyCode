package sreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindFirstElementOfTheList {

	public static void main(String[] args) {


		List<Integer> ls= Arrays.asList(1,2,30,4,5,5,6,77,8,3);
		// find first element in LIst
		ls.stream().findFirst().ifPresent(System.out::println);
		//count the total numbers of elements in the string
		long count =ls.stream().count();System.out.println(count);
		
		//find max value
		int max= ls.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max);
		
		//find min value
		int min = ls.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(min);
		int min1 = ls.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min1);
	}

}
