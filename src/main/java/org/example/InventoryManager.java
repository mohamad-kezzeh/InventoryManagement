package org.example;
import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> inventory = new ArrayList<>();

    public void addProduct(Product product){
        for(Product p: inventory){
            if(p.getProductId().equals(product.getProductId())){
                System.out.println("Product ID must be unique.");
                return;
            }
        }
        inventory.add(product);
        System.out.println("Product added successfully");
    }
    public void updateProduct(String productId,String name,double price, int quantity){
        for(Product p: inventory){
            if(p.getProductId().equals(productId)){
                p.setName(name);
                p.setPrice(price);
                p.setQuantity(quantity);
                System.out.println("Product Updated successfully");
                return;
            }
        }
        System.out.println("Product not found");
    }
    public void displayAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty");
        }
        else {
            for (Product p : inventory){
                System.out.println(p);
            }
        }
    }
}