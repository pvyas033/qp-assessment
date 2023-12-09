package com.pv.grocery.controller;

import com.pv.grocery.model.GroceryItem;
import com.pv.grocery.model.OrderItem;
import com.pv.grocery.request.OrderItemRequest;
import com.pv.grocery.response.OrderResponse;
import com.pv.grocery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/grocery-items")
    public ResponseEntity<List<GroceryItem>> viewGroceryItems() {
        List<GroceryItem> groceryItems = userService.viewGroceryItems();
        return ResponseEntity.ok(groceryItems);
    }
    
    @PostMapping("/book-order")
    public ResponseEntity<OrderResponse> bookOrder(@RequestBody List<OrderItemRequest> items) {
        OrderResponse orderResponse = userService.bookOrder(items);
        return ResponseEntity.ok(orderResponse);
    }
}

