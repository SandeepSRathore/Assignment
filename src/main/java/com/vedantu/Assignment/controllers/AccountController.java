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

import com.vedantu.Assignment.entities.Account;
import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.services.AccountService;
import com.vedantu.Assignment.services.OrderService;


@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/accounts/{id}")
	@ResponseBody
	public Account retrieveAccount(@PathVariable Long id) {
		return accountService.findById(id);
	}

	@PostMapping("/accounts/{id}")
	@ResponseBody
	public String createAccount(@RequestBody Account account) {

		accountService.createAccount(account);

		return "account created successfully"; // could returned ResponseEntity with status code and body but for simplicity not doing that
	}

	//we can have multiple mapping like PUT DELETE etc. above based on our requirements
}