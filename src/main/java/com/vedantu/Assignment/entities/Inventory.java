package com.vedantu.Assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//could have used lombok but wanted to keep the application simple 
@Entity
public class Inventory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	
	private String name;
	
	public Inventory() {
		super();
	}

	public Inventory(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + "]";
	}

}

