package com.vedantu.Assignment.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//could have used lombok but wanted to keep the application simple 
@Entity
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	
	private String username;
	
	@OneToMany(mappedBy="account",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<Order> orders;
	
	public Account() {
	}
	
	public Account(Long id, String username, Set<Order> orders) {
		super();
		this.id = id;
		this.username = username;
		this.orders = orders;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
}
