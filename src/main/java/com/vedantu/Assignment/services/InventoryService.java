package com.vedantu.Assignment.services;

import java.util.List;

import com.vedantu.Assignment.entities.Inventory;

public interface InventoryService {
	    public void createInventory(Inventory inventory);
	    public List<Inventory> getInventory();
	    public Inventory findById(long id);
	    public Inventory update(Inventory inventory, long l);
	    public void deleteInventoryById(long id);
}
