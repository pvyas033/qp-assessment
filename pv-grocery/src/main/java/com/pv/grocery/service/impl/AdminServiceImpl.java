package com.pv.grocery.service.impl;

import com.pv.grocery.model.GroceryItem;
import com.pv.grocery.repository.GroceryItemRepository;
import com.pv.grocery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private GroceryItemRepository groceryItemRepository;
    
    @Override
    public void addGroceryItem(GroceryItem groceryItem) {
        groceryItemRepository.save(groceryItem);
    }
    
    @Override
    public List<GroceryItem> viewGroceryItems() {
        return groceryItemRepository.findAll();
    }
    
    // Other service methods...
}
