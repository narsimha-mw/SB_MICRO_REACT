package com.retailer.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.retailer.product.model.Products;
import com.retailer.product.repository.ProductRepositiry;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepositiry productRepositiry;
	@Override
	public Products save(Products products) {
		// TODO Auto-generated method stub
		return productRepositiry.save(products);
	}
	@Override
	public List<Products> getAll() {
		
//		return productRepositiry.findAll();
	
		return productRepositiry.productNameNotNull();
}
//	public Products getProductName(String name) {
//		return productRepositiry.productNameNotNull(name);
//	
//	}

}
