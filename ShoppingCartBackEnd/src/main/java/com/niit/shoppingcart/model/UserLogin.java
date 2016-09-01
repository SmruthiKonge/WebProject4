package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="User_Login")
@Component
public class UserLogin {
	@Id
	private String userId;
	private String password;
	private String mobile;
	private String email;
	private String userName;
	private String address;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User_Login [userId=" + userId + ", password=" + password + ", mobile=" + mobile + ", userName="
				+ userName + ", address=" + address +", email=" + email +"]";
	}

	public int getAdmin() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}
