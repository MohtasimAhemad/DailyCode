package com.example.productCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.productCrud.model.Product;
import com.example.productCrud.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
    private ProductRepository productRepository;


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    
    public Product updateProduct(Product product) {
        Optional < Product > productDb = this.productRepository.findById(product.getId());

        if (productDb.isPresent()) {
            Product productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setName(product.getName());
            productUpdate.setDesc(product.getDesc());
            productRepository.save(productUpdate);
            return productUpdate;
        }
		return product; 
    }

    public List < Product > getAllProduct() {
        return this.productRepository.findAll();
    }

    public Product getProductById(int id) throws Exception {

        Optional < Product > productDb = this.productRepository.findById(id);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new Exception("Record not found with id : " + id);
        }
    }

    public void deleteProduct(int id) throws Exception {
        Optional < Product > productDb = this.productRepository.findById(id);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new Exception("Record not found with id : " + id);
        }

    }


	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
