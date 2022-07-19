package com.retailer.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

@Entity
@Table(name="retailer_product")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="product_name")
	@NonNull
	private String productName;
	
	@Column(name="product_desc")
	private String productDescription;
	
	@Column(name="product_price")
	@NonNull
	private Double productPrice;
	
	@Column(name="product_stock")
	@NonNull
	private Long productStock;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Long getProductStock() {
		return productStock;
	}

	public void setProductStock(Long productStock) {
		this.productStock = productStock;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productStock=" + productStock
				+ ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
				+ ", getProductDescription()=" + getProductDescription() + ", getProductPrice()=" + getProductPrice()
				+ ", getProductStock()=" + getProductStock() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
