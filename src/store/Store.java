package store;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public void addProductToStore(){
        products.add(new Product());
    }
    public void removeProductToStore(Product product){
        products.remove(product);
    }
    public void updateAmountOfProducts(Product product,int updateQuantity){
        product.setQuantity(updateQuantity);
    }

    public void showProductByCategory(String category){
        System.out.println("Товары в категории " + category + " :");
        for (Product item:products) {
            if(item.getCategory().equals(category)){
                System.out.println(" Название: " + item.getName()  + "-" + item.getPricePerUnit() + "$");
            }
        }
    }
    public double countTotalCost(){
        double totalProductsCost = 0;
        for (Product item:products){
          return totalProductsCost+= item.getPricePerUnit() * item.getQuantity();
        }
        return totalProductsCost;
    }
    public void makeAnOrder(User user, ArrayList<Product> products){
        Order order = new Order(user, products);
        orders.add(order);
    }
    public void processSale(Order order){
        for (Product product:order.getProducts()) {

    }
    public void showInfo(){
        System.out.println("Заказ");
            for (Order order:orders) {
                System.out.println("- пользователь: " + u);
            }

            }
    }
}
