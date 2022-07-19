package com.retailer.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailer.product.model.Products;

@Repository
public interface ProductRepositiry extends JpaRepository<Products, Integer> {

}
