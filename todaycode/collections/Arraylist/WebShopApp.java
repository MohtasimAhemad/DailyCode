package collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class WebShopApp {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();	
				
	products.add(new Product("Toy Car",90.67,"Its for fun"));
	products.add(new Product("Book",10.67,"Java Knowledge"));
	products.add(new Product("Vivo",20000.67,"tech use"));

//	for add purpose
	products.add(1, new Product("battery",786,"6W battery"));
	
//	for remove purpose
//	products.remove(2);
//	products.remove(new Product("battery",786,"6W battery"));
	
	
//	for replace purpose
//	products.set(0, new Product("oppo",20000.67,"tech use"));
	
	
	
	
//	System.out.println(products);
	
	
	for(Product product:products)
	{
		System.out.println(product);
	}
	
//	System.out.println("third element in the list");
//	System.out.println(products.get(2));
//	
//	System.out.println(products.size()+"products can be found in the list");
	
	
	ArrayList<Product> s=new ArrayList<>();
	s.add(new Product("Toy Car",90.67,"Its for fun"));
	s.add(new Product("Book",10.67,"Java Knowledge"));
	s.add(new Product("Vivo",20000.67,"tech use"));

	
	
	for(Product product:s)
	{
		System.out.println(s);
	}
	
	//How to add All Collections
	products.addAll(s);
	Collections.sort(products,Collections.reverseOrder());
	}
	
	
}
