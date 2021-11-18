package com.mongo.service;

import java.util.List;

import com.mongo.model.Product;

public interface IProductService {

	String addProduct(Product product);
	List<Product> viewAllProduct();
	Product viewProductById(String id);
	String deleteProductById(String id);
	String updateProductById(String id, Product product);
}
