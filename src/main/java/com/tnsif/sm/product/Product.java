package com.tnsif.sm.product;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	@Column(name="name")
    private String name;
	@Column(name="description")
    private String description;
	@Column(name="price")
    private double price;
	@Column(name="stockQuantity")
    private Integer stockQuantity;
	@Column(name="category")
    private String category;
	@Column(name="storeId")
    private Integer storeId;
    
public Product() {
	
}
public Product(Integer productId, String name, String description, double price, Integer stockQuantity, String category,
		Integer storeId) {
    super();
	this.productId = productId;
	this.name = name;
	this.description = description;
	this.price = price;
	this.stockQuantity = stockQuantity;
	this.category = category;
	this.storeId = storeId;
}

public int getProductId() {
	return productId ;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Integer getStockQuantity() {
	return stockQuantity;
}
public void setStockQuantity(Integer stockQuantity) {
	this.stockQuantity = stockQuantity;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getStoreId() {
	return storeId;
}
public void setStoreId(Integer storeId) {
	this.storeId = storeId;
}


}
