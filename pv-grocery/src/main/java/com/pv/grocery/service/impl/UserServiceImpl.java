package com.pv.grocery.service.impl;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    public List<GroceryItem> viewGroceryItems() {
        return groceryItemRepository.findAll();
    }
    
    @Override
    public OrderResponse bookOrder(List<OrderItem> items) {
        // Implement order processing logic and return the response
    }
}
