package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {

		//ArrayList 1
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		  // Creating an ArrayList from another collection


        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        
        
        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);
        
        firstFivePrimeNumbers.forEach(element -> {
            System.out.println(element);
        });
        
        
        
	}

}

