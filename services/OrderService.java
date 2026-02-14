package services;
import Exceptions.*;
import model.*;
import payment.*;
import java.util.List;

public class OrderService {
    private InventoryService inventoryService;
    
    public OrderService(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    public Order createOrder(String orderId, User user){
        return new Order(orderId, user);
    }

    public void addItem(Order order, Product product, int quantity){
        if(quantity<=0) throw new IllegalArgumentException("Quantity must be positive");
        OrderItem item = new OrderItem(product, quantity);
        order.addItem(item); 
    }

    public double calculateTotal(Order order){
        double totalPrice = 0;
        
        for(OrderItem item: order.getItems()){
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public void checkout(Order order, Payment paymentMethod) throws InsufficientStockException, InvalidOrderStateException{
        if(paymentMethod == null) throw new IllegalArgumentException("Payment method cannot be empty");
        
        if(order.getStatus() != (OrderStatus.CREATED)) throw new InvalidOrderStateException("Order is not in CREATED State");

        List<OrderItem> items = order.getItems();
        if(items.isEmpty()) throw new InvalidOrderStateException("Order has no items");

        for(OrderItem item: items){
            int availableStock = inventoryService.getStock(item.getProduct());
            if(availableStock < item.getQuantity()){
                throw new InsufficientStockException("Insufficient stock for product: "+item.getProduct().getName());
            }
        }

        double totalAmount = calculateTotal(order);
        paymentMethod.processPayment(totalAmount);

        for(OrderItem item: items){
            inventoryService.reduceStock(item.getProduct(), item.getQuantity());
        }

        order.setStatus(OrderStatus.PAID);
    }
}
