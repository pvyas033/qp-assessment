package com.pv.grocery.service;

public interface UserService {
    List<GroceryItem> viewGroceryItems();
    OrderResponse bookOrder(List<OrderItem> items);
}
