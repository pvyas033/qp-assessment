package com.pv.grocery.controller;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @PostMapping("/grocery-items")
    public ResponseEntity<String> addGroceryItem(@RequestBody GroceryItem groceryItem) {
        adminService.addGroceryItem(groceryItem);
        return ResponseEntity.ok("Grocery item added successfully");
    }
    
    @GetMapping("/grocery-items")
    public ResponseEntity<List<GroceryItem>> viewGroceryItems() {
        List<GroceryItem> groceryItems = adminService.viewGroceryItems();
        return ResponseEntity.ok(groceryItems);
    }
    
    // Other endpoints (update, delete, manage inventory)...
}