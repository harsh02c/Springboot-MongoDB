package com.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Product;

public interface IProductDao extends MongoRepository<Product, String> {
    
 

}