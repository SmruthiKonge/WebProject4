package com.niit.shoppingcart.model;

import java.io.Serializable;


import java.util.UUID;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "product")
@Component
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@NotBlank(message="Give Product name")
	private String name;
	@NotBlank(message="Give Product description")
	private String description;
	@NotBlank(message="Select Categoryid")
	private String categoryId;
	@NotBlank(message="Select Supplierid")
	private String supplierId;
	@Min(value=0,message="Cannot give quantity less than zero")
	private int quantity;
	@Min(value=300,message="Cannot give quantity less than 300")
	private double price;

	
	@Transient
	private MultipartFile imageUrl;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public MultipartFile getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(MultipartFile imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*@Override
	public String toString() {
		return "Product [productId=" + id + ", productName=" + name + ", description=" + description
				+  ", price=" + price + "]";
	}
	*/
	@Override
	public String toString() {
		return "Product [productId=" + id + ", productName=" + name + ", description=" + description
				+ ", categoryId=" + categoryId + ", supplierId=" + supplierId + ", imageUrl=" + imageUrl + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
public Product() {
		
		this.id="PRD"+UUID.randomUUID().toString().substring(24).toUpperCase();
		
	}


}