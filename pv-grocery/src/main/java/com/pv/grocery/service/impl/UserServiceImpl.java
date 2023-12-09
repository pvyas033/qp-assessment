package com.pv.grocery.service.impl;

import com.pv.grocery.model.GroceryItem;
import com.pv.grocery.model.Order;
import com.pv.grocery.model.OrderItem;
import com.pv.grocery.repository.GroceryItemRepository;
import com.pv.grocery.repository.OrderRepository;
import com.pv.grocery.request.OrderItemRequest;
import com.pv.grocery.response.OrderResponse;
import com.pv.grocery.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public OrderResponse bookOrder(List<OrderItemRequest> items) {
        Order order = new Order();
        double totalAmount = 0;
        
        for (OrderItemRequest item : items) {
            GroceryItem groceryItem = (GroceryItem) groceryItemRepository.findById(item.getItemId())
                    .orElseThrow(() -> new EntityNotFoundException("Grocery item not found"));
            
            if (groceryItem.getQuantity() < item.getQuantity()) {
                throw new IllegalArgumentException("Not enough stock for item: " + groceryItem.getName());
            }
            
            OrderItem orderItem = new OrderItem();
            orderItem.setGroceryItem(groceryItem);
            orderItem.setQuantity(item.getQuantity());
            orderItem.setOrder(order);
            
            totalAmount += groceryItem.getPrice() * item.getQuantity();
            
            groceryItem.setQuantity(groceryItem.getQuantity() - item.getQuantity());
            groceryItemRepository.save(groceryItem);
            
            order.getItems().add(orderItem);
        }
        
        orderRepository.save(order);
        
        OrderResponse orderResponse = new OrderResponse(order.getId(), totalAmount);
        return orderResponse;
    }
}
