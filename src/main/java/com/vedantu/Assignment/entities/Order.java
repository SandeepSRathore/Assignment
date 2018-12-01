package com.vedantu.Assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders") //as order is keyword in sql
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	
	private String item;
	
	@ManyToOne
	private Account account;
	
	@ManyToOne
	private Inventory inventory;

	public Order() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}
