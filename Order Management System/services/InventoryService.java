package services;
import model.Product;
import java.util.Map;

import Exceptions.InsufficientStockException;

import java.util.HashMap;

public class InventoryService {
    private Map<Product, Integer> inventory;
    
    public InventoryService(){
        inventory = new HashMap<>();
    }

    public void addStock(Product product, int quantity){
        inventory.put(product, inventory.getOrDefault(product,0)+quantity);
    }

    public void reduceStock(Product product, int quantity) throws InsufficientStockException{
        int currentQuantity = inventory.getOrDefault(product,0);
        if(currentQuantity>=quantity) inventory.put(product, currentQuantity-quantity);
        else throw new InsufficientStockException("Not Enough Stock");
    }

    public int getStock(Product product){
        return inventory.getOrDefault(product,0);
    }

}