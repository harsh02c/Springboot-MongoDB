package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.Product;
import com.mongo.service.IProductService;

@RestController
@RequestMapping(value = "/productController")
public class ProductController {
	@Autowired
	IProductService productservice;
	
	@PostMapping(value = "/addNewProduct")
	public ResponseEntity<String> addNewProduct(@RequestBody Product product) {	
		// @RequestBody helps to take data from the user
		return new ResponseEntity<String>(productservice.addProduct(product), HttpStatus.OK);		
	}
	
	@GetMapping(value = "/viewAllProduct")
	public ResponseEntity<List<Product>> viewAllProduct(){
		return new ResponseEntity<List<Product>>(productservice.viewAllProduct(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/viewProductById/{id}")
	public ResponseEntity<Product> viewProductById(@PathVariable String id){	
		//@PathVariable is used if you want to find element by passing parameter inside path
		return new ResponseEntity<Product>(productservice.viewProductById(id), HttpStatus.OK);	
	}
	
	@DeleteMapping(value = "/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable String id){
		return new ResponseEntity<String>(productservice.deleteProductById(id), HttpStatus.OK);
	} 
	
	@PutMapping(value = "/updateProductById/{id}")
	public ResponseEntity<String> updateProductById(@PathVariable String id, @RequestBody Product product){
		return new ResponseEntity<String>(productservice.updateProductById(id, product), HttpStatus.OK);
	}
	
}
