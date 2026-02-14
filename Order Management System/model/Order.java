package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order{
    private String orderId;
    private User user;
    private List<OrderItem> items;
    private OrderStatus status;    

    public Order(String orderId, User user){
        this.orderId = orderId;
        this.user = user;
        this.items = new ArrayList<>();
        this.status = OrderStatus.CREATED;
    }

    public String getOrderId(){
        return orderId;
    }
    public User getUser(){
        return user;
    }
    public List<OrderItem> getItems(){
        return Collections.unmodifiableList(items);
    }
    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public void clearItems(){
        items.clear();
    }
    public boolean hasItems(){
        return !items.isEmpty();
    }


    @Override
    public String toString(){
        return String.format(
            "Order{orderId='%s', user=%s, items=%s, status=%s}",
            orderId, user, items, status
        );
    }

    
}