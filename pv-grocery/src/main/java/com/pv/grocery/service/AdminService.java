package com.pv.grocery.service;

public interface AdminService {
    void addGroceryItem(GroceryItem groceryItem);
    List<GroceryItem> viewGroceryItems();
    // Other service methods...
}
