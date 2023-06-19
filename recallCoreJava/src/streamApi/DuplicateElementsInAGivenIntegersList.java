package sreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInAGivenIntegersList {


	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3,4,12,34,15,15,16,16,21,19);
		Set<Integer> set = new HashSet<>();
		ls.stream().filter(n->!set.add(n))
        .forEach(System.out::println);

		
	}

}
