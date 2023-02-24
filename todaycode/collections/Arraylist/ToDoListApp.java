package collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {

	public static void main(String[] args) {

		ArrayList<String> urgentTasks= new ArrayList();
		ArrayList<String> allTasks= new ArrayList();
		
		urgentTasks.add("Repairing the Car");
		urgentTasks.add("Paying the checks");

		allTasks.add("Cleaning the bathroom");
		allTasks.add("Moving the Lawn");
		allTasks.add("Going the grocery store");
		
		
		
//		Collections.swap(allTasks, 0, 2); // swapping
		
		System.out.println("Urgent tasks:");
		for(String task:urgentTasks)
		{
			System.out.println("- "+ task);
		}
		
		allTasks.addAll(urgentTasks); // add the both tasks using addAll method.
		
//		Collections.sort(allTasks);  // sort the alltasks
//		Collections.sort(allTasks,Collections.reverseOrder()); //  if you want to reverse your collection then that time u used reversOrder() method.
		
		
		
		System.out.println("All tasks:");
		
		for(String task:allTasks)
		{
			System.out.println("- "+ task);
		}
		 System.out.println("--------------------------------------");
	        if (allTasks.contains("Cleaning the bathroom")){
	            System.out.println("I haven't cleaned the bathroom");
	        }

	        System.out.println("--------------------------------------");
	        System.out.println("The first 3 most important tasks:");
	        for (String task : allTasks.subList(0, 3)) {
	            System.out.println("- " + task);
	        }

	        Collections.shuffle(allTasks);
	        System.out.println("--------------------------------------");
	        System.out.println("Shuffled tasks:");
	        for (String task : allTasks) {
	            System.out.println("- " + task);

	        }

	}

}
