package sreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutAllTheEvenNnumberStream {

	public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter(i->i%2==0).forEach(System.out::println);
	}
}
