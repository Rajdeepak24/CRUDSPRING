package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Product;



public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}