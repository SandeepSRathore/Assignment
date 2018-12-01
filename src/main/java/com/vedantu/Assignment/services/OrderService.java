package com.vedantu.Assignment.services;

import java.util.List;

import com.vedantu.Assignment.entities.Order;

public interface OrderService {
	    public void createOrder(Order order);
	    public List<Order> getOrder();
	    public Order findById(long id);
	    public Order update(Order order, long l);
	    public void deleteOrderById(long id);
}
