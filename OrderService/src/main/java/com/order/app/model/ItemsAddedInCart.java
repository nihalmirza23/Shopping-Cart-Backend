package com.order.app.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ItemsAddedInCart {
	 private String productName;
	   private int quantity;
	   private double productPrice;
	   private List<String> productImage;
		private String productId;
	   
	   
	public ItemsAddedInCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public List<String> getProductImage() {
		return productImage;
	}


	public void setProductImage(List<String> productImage) {
		this.productImage = productImage;
	}


	public ItemsAddedInCart(String productName, int quantity, double productPrice, List<String> productImage ,String productId) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.productImage = productImage;
		this.productId = productId;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	   
	   

}
