package com.vedantu.Assignment;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vedantu.Assignment.repositories.AccountRepository;
import com.vedantu.Assignment.repositories.InventoryRepository;
import com.vedantu.Assignment.repositories.OrderRepository;
import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.entities.Inventory;
import com.vedantu.Assignment.entities.Account;


@SpringBootApplication
public class AssignmentApplication {

	@Autowired
	private OrderRepository OrderRepository;
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	
	
	// we can load the initial data by this method,could have loaded sql script also
	@Bean
	public CommandLineRunner loadData(OrderRepository repository) {
	    return (args) -> {
	        // save a couple of inventories
	    	Inventory inventory1 = inventoryRepository.save(new Inventory(1L, "inventory1"));
	    	Inventory inventory2 = inventoryRepository.save(new Inventory(2L, "inventory2"));

	    	System.out.println(inventory1.toString());
	    	System.out.println(inventory2.toString());  //check application to confirm values are being saved in inventory table
	    	//inventory1 and inventory2 we can set inside each order
	    	
	    	//same way we can load the data for other repositories also
	       
	    };
	}
}
