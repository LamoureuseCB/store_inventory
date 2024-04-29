package store;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class Order {
    private User user;
    private ArrayList<Product> products;
    private double totalCost;

    public Order(User user, ArrayList<Product> products, double totalCost) {
        this.user = user;
        this.products = products;
        this.totalCost = totalCost;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addProduct(Product product) {
        products.add(product);


    }

    public double countTotalCost() {
        double totalSum = 0;
        for (Product product : products) {
            totalSum += product.getPricePerUnit() * product.getQuantity();
        }
        totalCost = totalSum;
        return totalCost;

    }

}
