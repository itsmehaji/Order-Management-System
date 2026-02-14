package model;

public class OrderItem {
    private Product product;
    private int quantity;

    OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return String.format(
            "OrderItem{product=%s, quantity=&d}",
            product, quantity
        );
    }
}
