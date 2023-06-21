package com.example.productCrud.service;

import java.util.List;

import com.example.productCrud.model.Product;

public interface ProductService {
	Product createProduct(Product product);
	Product updateProduct(Product product);
	List < Product > getAllProduct();
	Product getProductById(Integer id);
	void deleteProduct(Integer id);


}
