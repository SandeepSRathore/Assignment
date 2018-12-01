package com.vedantu.Assignment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.repositories.OrderRepository;
import com.vedantu.Assignment.services.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void createOrder(Order order) {
        // TODO Auto-generated method stub
        orderRepository.save(order);
    }

    public List<Order> getOrder() {
        // TODO Auto-generated method stub
        return (List<Order>) orderRepository.findAll();
    }

    public Order findById(long id) {
        // TODO Auto-generated method stub
        return orderRepository.findById(id).get();
    }

    public Order update(Order order, long l) {
        // TODO Auto-generated method stub
        return orderRepository.save(order);
    }

    public void deleteOrderById(long id) {
        // TODO Auto-generated method stub
        orderRepository.deleteById(id);
    }

}
