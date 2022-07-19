package com.retailer.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retailer.product.model.Products;

@Service
public interface ProductService {

	Products save(Products products);

	List<Products> getAll();

//	Products getProductName(String name);


}
