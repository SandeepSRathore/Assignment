package com.vedantu.Assignment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vedantu.Assignment.entities.Inventory;
import com.vedantu.Assignment.entities.Order;
import com.vedantu.Assignment.repositories.InventoryRepository;
import com.vedantu.Assignment.repositories.OrderRepository;
import com.vedantu.Assignment.services.InventoryService;
import com.vedantu.Assignment.services.OrderService;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public void createInventory(Inventory inventory) {
        // TODO Auto-generated method stub
        inventoryRepository.save(inventory);
    }

    public List<Inventory> getInventory() {
        // TODO Auto-generated method stub
        return (List<Inventory>) inventoryRepository.findAll();
    }

    public Inventory findById(long id) {
        // TODO Auto-generated method stub
        return inventoryRepository.findById(id).get();
    }

    public Inventory update(Inventory inventory, long l) {
        // TODO Auto-generated method stub
        return inventoryRepository.save(inventory);
    }

    public void deleteInventoryById(long id) {
        // TODO Auto-generated method stub
        inventoryRepository.deleteById(id);
    }

}
