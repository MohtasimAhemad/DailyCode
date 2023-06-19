package sreamApi;

import java.util.*;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilteringCollectionByUsingStream {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1,"Apple",10000));
		productList.add(new Product(2,"Samsung",90000));
		productList.add(new Product(3,"LG",786965));
		productList.add(new Product(4,"HP ",25000));  
        productList.add(new Product(5,"Dell ",30000));  
        productList.add(new Product(6,"Lenevo ",28000));  
        productList.add(new Product(7,"Sony ",28000));  
        productList.add(new Product(8,"Apple ",90000));  
        
        List<String> companies = new ArrayList<String>();
                companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate
        System.out.println("*************************************************");
        List<String> distinctCompanies=companies.stream().distinct().collect(Collectors.toList());
        distinctCompanies.stream().forEach(System.out::println);
        System.out.println("*************************************************");
        
        for (String distinctCompany : distinctCompanies) {
            companies.remove(distinctCompany);
        }
        companies.forEach(System.out::println);
       List<Double>  productList2= productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());

       System.out.println("*************************************************");
		System.out.println(productList2);
		System.out.println("*************************************************");
		productList2.stream().forEach(System.out::println);
		System.out.println("*************************************************");
		List<String> productList3 = productList.stream().filter(p->p.name.startsWith("A")).map(p->p.name).collect(Collectors.toList());
		productList3.stream().forEach(System.out::println);
		System.out.println("*************************************************");
		
		
		List<Product> productList4=productList.stream()
                .distinct()
                .collect(Collectors.toList());
		System.out.println(productList4);
		productList4.stream().forEach(System.out::println);
		System.out.println("*************************************************");
		
	}

}
