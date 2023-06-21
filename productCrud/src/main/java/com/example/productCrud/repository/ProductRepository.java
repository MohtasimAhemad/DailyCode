package com.example.productCrud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productCrud.model.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

	  Product createProduct(Product product);
	  Product updateProduct(Product product);
	  List < Product > getAllProduct();
	  Product getProductById(Integer productId);
	  void deleteProduct(Integer id);
}

