package com.vedantu.Assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedantu.Assignment.entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}