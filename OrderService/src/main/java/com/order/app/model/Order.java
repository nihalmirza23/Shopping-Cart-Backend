package com.order.app.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Order {

	@Id
	private String orderId;

	@Field
	private LocalDate OrderDate;

	


	private Double AmountPaid;


	private String ModeOfPayment;
	
	private List<ItemsAddedInCart> items;

	@Field
	private String OrderStatus;

	@Field
	private Address address;
	
	private String username;
	
	private String userId;

	




	public Order(String orderId, LocalDate orderDate, Double amountPaid, String modeOfPayment,
			List<ItemsAddedInCart> items, String orderStatus, Address address, String username, String userId) {
		super();
		this.orderId = orderId;
		OrderDate = orderDate;
		AmountPaid = amountPaid;
		ModeOfPayment = modeOfPayment;
		this.items = items;
		OrderStatus = orderStatus;
		this.address = address;
		this.username = username;
		this.userId = userId;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<ItemsAddedInCart> getItems() {
		return items;
	}

	public void setItems(List<ItemsAddedInCart> items) {
		this.items = items;
	}

	

	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}



	public Double getAmountPaid() {
		return AmountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		AmountPaid = amountPaid;
	}

	public String getModeOfPayment() {
		return ModeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		ModeOfPayment = modeOfPayment;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}