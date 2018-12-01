package com.vedantu.Assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vedantu.Assignment.entities.Inventory;
import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.services.InventoryService;
import com.vedantu.Assignment.services.OrderService;


@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/inventories/{id}")
	@ResponseBody
	public Inventory retrieveInventory(@PathVariable Long id) {
		return inventoryService.findById(id);
	}

	@PostMapping("/inventories/{id}")
	@ResponseBody
	public String createInventory(@RequestBody Inventory inventory) {

		inventoryService.createInventory(inventory);

		return "Inventory created successfully"; // could returned ResponseEntity with status code and body but for simplicity not doing that
	}

	//we can have multiple mapping like above based on our requirements
}