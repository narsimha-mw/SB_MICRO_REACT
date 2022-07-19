package com.retailer.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.retailer.product.model.Products;

import java.util.List;

@Repository
public interface ProductRepositiry extends JpaRepository<Products, Integer> {

	@Query("SELECT p FROM Products p WHERE p.productName IS NOT NULL AND p.productPrice IS NOT NULL AND p.productStock IS NOT NULL")
	List<Products> productNameNotNull();

}
