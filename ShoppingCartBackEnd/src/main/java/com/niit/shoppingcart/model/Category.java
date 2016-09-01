package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name="CATEGORY")
@Component
public class Category {
	@Id
	private String id;
	private String name;
	private String description;
	

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

	

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description
				+ "]";
	}

	public MultipartFile getCategoryImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
