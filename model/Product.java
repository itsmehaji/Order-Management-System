package model;

import java.util.Objects;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return String.format(
            "Product{productId='%s', name='%s', price=%.2f}",
            productId, name, price
        );
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(productId);
    }
}
