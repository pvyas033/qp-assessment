package com.pv.grocery.service;

import com.pv.grocery.model.GroceryItem;
import com.pv.grocery.request.OrderItemRequest;
import com.pv.grocery.response.OrderResponse;

import java.util.List;

public interface UserService {
    List<GroceryItem> viewGroceryItems();
    OrderResponse bookOrder(List<OrderItemRequest> items);
}
