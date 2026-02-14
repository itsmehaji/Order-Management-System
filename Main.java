import model.*;
import services.*;
import payment.*;

public class Main {

    public static void main(String[] args){
        InventoryService inventoryService = new InventoryService();
        OrderService orderService = new OrderService(inventoryService);

        Product laptop = new Product("P101", "Laptop",50000);
        Product phone = new Product("P102", "Phone", 20000);

        inventoryService.addStock(laptop, 5);
        inventoryService.addStock(phone, 10);

        User user = new User("U101", "Haji", "haji@gmail.com");

        Order order = orderService.createOrder("O101", user);
        orderService.addItem(order,laptop, 2);
        orderService.addItem(order, phone, 1);

        Payment paymentMethod = new UpiPayment();
    
        try{
            orderService.checkout(order, paymentMethod);
            System.out.println("Checkout Successful!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(order);
        System.out.println("Remaining laptop stock: "+inventoryService.getStock(laptop));
        System.out.println("Remaining phone stock: "+inventoryService.getStock(phone));
    }
}
