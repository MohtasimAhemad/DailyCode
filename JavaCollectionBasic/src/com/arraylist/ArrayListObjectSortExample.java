package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person
{
	private String name;
	private Integer age;
	
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class ArrayListObjectSortExample {

	public static void main(String[] args) {

		
		List<Person> people = new ArrayList<>();	
		
		people.add(new Person("Kashif",23));
		people.add(new Person("Roshan",22));
		people.add(new Person("Muskan",13));
		people.add(new Person("Akash",33));
		people.add(new Person("Riyaz",53));
		
		System.out.println("name and their Age : "+ people);

//	for(Person person:people)
//	{
//		
//		System.out.println("name and their Age : "+ person);
//	}
		
		
		// Sort People by their Age
    
//	people.sort((person1,person2)->
//	{
//		return person1.getAge()- person2.getAge();
//	});
	
	
	
	
    // A more concise way of writing the above sorting function
//	people.sort(Comparator.comparingInt(Person::getAge));
	
		
        // You can also sort using Collections.sort() method by passing the custom Comparator
	     Collections.sort(people, Comparator.comparing(Person::getName));
	     System.out.println(" Sorted by age "+people);
	}

}                   
