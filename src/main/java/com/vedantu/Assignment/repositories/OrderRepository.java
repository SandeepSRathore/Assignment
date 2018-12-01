package com.vedantu.Assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedantu.Assignment.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}