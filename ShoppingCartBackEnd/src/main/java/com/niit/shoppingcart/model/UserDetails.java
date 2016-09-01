package com.niit.shoppingcart.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "USER_DETAILS")
@Component
public class UserDetails {
	@Id
	private String userId;
	@Column(name = "mobile")
	private String mobile;
	private String email;
	private String password;
	private String userName;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private byte admin;

	
	 public byte getAdmin() { return admin; }
	 
	 public void setAdmin(byte admin) { this.admin = admin; }
	 

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", password=" + password + ", Email="
				+ email + ", mobile=" + mobile +  "]";
	}

	
}