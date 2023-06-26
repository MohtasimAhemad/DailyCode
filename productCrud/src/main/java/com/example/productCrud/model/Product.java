package com.example.productCrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productdb")
public class Product {
	
	@Id
	private int id;
	private String name;
	private String desc;
	
	public Product(int id, String name,String desc)
	{
		this.id=id;
		this.name=name;
		this.desc=desc;
	}
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getDesc()
	{
		return desc;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}

}
