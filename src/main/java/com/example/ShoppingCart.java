package com.example;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> ShoppingCart;

    public ShoppingCart() {
        ShoppingCart= new ArrayList <Product> ();
    }

    public void addProduct(Product product) {
        ShoppingCart.add(product);
    }

    public void removeProduct(Product product) {
        ShoppingCart.remove(product);
    }

    public double totalCost() {
        double totalmoney=0;
        for (Product product: ShoppingCart) {
            totalmoney += product.getPrice();
        }
        return totalmoney;
    }

    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
}