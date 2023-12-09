package com.pv.grocery.service;

import com.pv.grocery.model.GroceryItem;

import java.util.List;

public interface AdminService {
    void addGroceryItem(GroceryItem groceryItem);
    List<GroceryItem> viewGroceryItems();
    // Other service methods...
}
