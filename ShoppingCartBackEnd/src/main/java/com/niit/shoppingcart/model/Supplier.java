package com.niit.shoppingcart.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="SUPPLIER")
@Component
public class Supplier {
	@Id
	private String supId;
	private String supName;
	private String supContact;
	private String supEmail;
	private String supAddress;
	

	public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupContact() {
		return supContact;
	}

	public void setSupContact(String supContact) {
		this.supContact = supContact;
	}

	public String getSupEmail() {
		return supEmail;
	}

	public void setSupEmail(String supEmail) {
		this.supEmail = supEmail;
	}

	public String getSupAddress() {
		return supAddress;
	}

	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}

	

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supId + ", supplierName=" + supName + ", supplierContact="
				+ supContact + ", supplierEmail=" + supEmail + ", supplierAddress=" + supAddress
				+"]";
	}

	
	

}
