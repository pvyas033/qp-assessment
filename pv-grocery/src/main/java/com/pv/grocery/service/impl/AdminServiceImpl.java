package com.pv.grocery.service.impl;

import com.pv.grocery.service.AdminService;

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
