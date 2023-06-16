package recallCoreJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

public static void main(String[] args) {

	List<String> topCompanies = new ArrayList<String>();
//	System.out.println("is the topCompanies list empty ? :"+topCompanies.isEmpty());
	
	topCompanies.add("Google");
	topCompanies.add("Apple");
	topCompanies.add("Facebook");
	topCompanies.add("Amazon");
	topCompanies.add("Microsoft");
	System.out.println(topCompanies);
	
	// Retrieve the element at a given index
    String bestCompany = topCompanies.get(0);
    String secondBestCompany = topCompanies.get(1);
    String lastCompany = topCompanies.get(topCompanies.size() - 1);

    System.out.println("Best Company: " + bestCompany);
    System.out.println("Second Best Company: " + secondBestCompany);
    System.out.println("Last Company in the list: " + lastCompany);

    // Modify the element at a given index
    topCompanies.set(4, "Walmart");
    System.out.println("Modified top companies list: " + topCompanies);

	
		
	}

}
