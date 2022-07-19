package com.retailer.product.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.product.model.Products;
import com.retailer.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Products> getAll() {
	  List<Products> filterList = productService.getAll();
	  List<Boolean> data = filterList.stream().map(p->p.getProductName()!=null).collect(Collectors.toList());
	  System.err.println("with null"+ data);
	  System.out.println("without null"+ filterList.removeAll(Collections.singletonList(null)));
	  return null;
	}
	@PostMapping("/save")
	public Products save(@RequestBody Products products) {
		System.err.print("products"+ products);
	return productService.save(products);		
	}
	@GetMapping("/test")
	public String test() {
	return "working fine has expeted..good";
	}
}
