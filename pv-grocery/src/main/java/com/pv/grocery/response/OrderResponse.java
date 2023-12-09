package com.pv.grocery.response;

public class OrderResponse {
    private Long orderId;
    private double totalAmount;
    
    public OrderResponse(Long id, double totalAmount){
    }
    
    public Long getOrderId(){
        return orderId;
    }
    
    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }
    
    public double getTotalAmount(){
        return totalAmount;
    }
    
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
}
