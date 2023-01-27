package com.order.app.service;

import java.util.List;

import com.order.app.model.Address;
import com.order.app.model.Order;

public interface OrderService {


	public List<Order> getAllOrder();

	public Order getOrderById(String orderId);

	public String deleteOrderById(String orderId);

	public List<Order> getOrdersByUserId(String UserId);

	public Order cancelOrderByOrderId(String orderId);

	public Order editOrder(String orderId);
	
	public Order editModeofPay(String orderId);

	
	
	
	
	
}
