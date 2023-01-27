package com.order.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.app.model.Cart;
import com.order.app.model.Order;
import com.order.app.model.UserProfile;
import com.order.app.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
    public Order addOrder(String userId,Order order) {
		
		Cart cart = restTemplate.getForObject("http://localhost:8097/cart/byUser/"+userId, Cart.class);
		
		
		UserProfile profile = restTemplate.getForObject("http://localhost:8095/api/user/"+userId,
				UserProfile.class);
		
		System.out.println(profile);
		order.setItems(cart.getProductsAdded());
		order.setAddress(profile.getAddress());
		order.setAmountPaid(cart.getTotalPrice());
		order.setUserId(userId);
		order.setUsername(profile.getUserName());
		order.setOrderDate(LocalDate.now());
		
		order.setOrderStatus("Order Placed");
		return orderRepository.save(order);
	}

	// get all Order
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	// get Order by order id
	public Order getOrderById(String orderId) {
	
		
	   Order order= orderRepository.findById(orderId).get();
	
	   return order;
	   
	}
	
	
  // delete Order by id
	public String deleteOrderById(String orderId) {
		orderRepository.deleteById(orderId);
		return "Order Deleted  or Cancled Succesfully";
	}

	// get order by customer ID
	public List<Order> getOrdersByUserId(String UserId) {
		List<Order> orders = orderRepository.findByUserId(UserId);
		return orders;

	}

	@Override
	public Order cancelOrderByOrderId(String orderId) {
		Order order = orderRepository.findById(orderId).get();
		order.setOrderStatus("Cancelled");
		return orderRepository.save(order);
		
	}
	
	@Override
	public Order editOrder(String orderId) {
		Order order = orderRepository.findById(orderId).get();
		order.setModeOfPayment("EWALLET");
		return orderRepository.save(order);
	
	}
	
	@Override
	public Order editModeofPay(String orderId) {
		Order order = orderRepository.findById(orderId).get();
	    order.setModeOfPayment("PAYMENT GATEWAY");
       	return orderRepository.save(order);
		
	}
	


}
