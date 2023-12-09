package com.pv.grocery.controller;

import com.pv.grocery.model.GroceryItem;
import com.pv.grocery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @PostMapping("/add-item")
    public ResponseEntity<String> addGroceryItem(@RequestBody GroceryItem groceryItem) {
        adminService.addGroceryItem(groceryItem);
        return ResponseEntity.ok("Grocery item added successfully");
    }
    
    @GetMapping("/grocery-items")
    public ResponseEntity<List<GroceryItem>> viewGroceryItems() {
        List<GroceryItem> groceryItems = adminService.viewGroceryItems();
        return ResponseEntity.ok(groceryItems);
    }
    
}