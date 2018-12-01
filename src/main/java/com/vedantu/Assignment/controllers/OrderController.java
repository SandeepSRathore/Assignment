package com.vedantu.Assignment.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.services.OrderService;


@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders/{id}")
	@ResponseBody
	public Order retrieveOrder(@PathVariable Long id) {
		return orderService.findById(id);
	}

	@PostMapping("/orders/{id}")
	@ResponseBody
	public String createOrder(@RequestBody Order order) {

		orderService.createOrder(order);

		return "order placed successfully"; // could returned ResponseEntity with status code and body but for simplicity not doing that
	}

	//we can have multiple mapping like above based on our requirements
}