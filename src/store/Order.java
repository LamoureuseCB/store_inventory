package store;

import java.util.ArrayList;

public class Order {
    private User user;
    private ArrayList<Product> products;
    private double totalCost;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
        this.totalCost = 0;
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

    public double calculateTotalCost() {
        double totalSum = 0;
        for (Product product : products) {
            totalSum += product.getPricePerUnit() * product.getQuantity();
        }
        totalCost = totalSum;
        return totalCost;

    }

}
