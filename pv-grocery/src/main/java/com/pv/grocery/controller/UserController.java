package com.pv.grocery.controller;

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
    public ResponseEntity<OrderResponse> bookOrder(@RequestBody List<OrderItem> items) {
        OrderResponse orderResponse = userService.bookOrder(items);
        return ResponseEntity.ok(orderResponse);
    }
}
