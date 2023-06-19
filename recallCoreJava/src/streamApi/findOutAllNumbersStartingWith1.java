package sreamApi;

import java.util.Arrays;
import java.util.List;

public class findOutAllNumbersStartingWith1 {

	public static void main(String[] args) {

List<Integer> ls = Arrays.asList(1,2,3,4,12,34,15,16,21,19);

ls.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);

	}

}
