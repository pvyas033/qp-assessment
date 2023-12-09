package com.pv.grocery.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "grocery_item_id")
    private GroceryItem groceryItem;
    
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public GroceryItem getGroceryItem(){
        return groceryItem;
    }
    
    public void setGroceryItem(GroceryItem groceryItem){
        this.groceryItem = groceryItem;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public Order getOrder(){
        return order;
    }
    
    public void setOrder(Order order){
        this.order = order;
    }
}

