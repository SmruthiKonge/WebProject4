package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {

	@Id
	private String cartProductId;
	private String cartProductName;
	private String cartProductUser;
	private double cartProductPrice;

	public String getCartProductId() {
		return cartProductId;
	}

	public void setCartProductId(String cartProductId) {
		this.cartProductId = cartProductId;
	}

	public String getCartProductName() {
		return cartProductName;
	}

	public void setCartProductName(String cartProductName) {
		this.cartProductName = cartProductName;
	}

	public String getCartProductUser() {
		return cartProductUser;
	}

	public void setCartProductUser(String cartProductUser) {
		this.cartProductUser = cartProductUser;
	}

	public double getCartProductPrice() {
		return cartProductPrice;
	}

	public void setCartProductPrice(double cartProductPrice) {
		this.cartProductPrice = cartProductPrice;
	}

	@Override
	public String toString() {
		return "Cart [id=" + cartProductId + ", name=" + cartProductName + ", user=" + cartProductUser
				+ ",price=" + cartProductPrice + "]";
	}
	
}
