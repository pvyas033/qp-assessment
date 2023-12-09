package com.pv.grocery.request;

public class OrderItemRequest {
    private Long itemId;
    private int quantity;
    
    // Constructors, getters, and setters
    
    public OrderItemRequest() {
        // Default constructor for JSON serialization
    }
    
    public OrderItemRequest(Long itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }
    
    public Long getItemId() {
        return itemId;
    }
    
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

