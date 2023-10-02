package com.example;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> productList;
    private double price;

    public ShoppingCart() {
        productList= new ArrayList <Product> ();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public double totalCost() {
        double totalmoney=0;
        for (Product product: productList) {
            totalmoney += this.price;
        }
    return totalmoney;
    }

    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
}
