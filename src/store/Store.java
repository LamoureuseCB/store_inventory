package store;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Store() {
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProductToStore(Product product){
        products.add(product);
    }
    public void removeProductFromStore(Product product){
        products.remove(product);
    }
    public void updateAmountOfProducts(Product product,int updatedQuantity){
        product.setQuantity(updatedQuantity);
    }

    public void showProductByCategory(String category){
        System.out.println("Товары в категории " + category + " :");
        for (Product product:products) {
            if(product.getCategory().equals(category)){
                System.out.println(" Название товара: " + product.getName()  + " - " + product.getPricePerUnit() + "$");
            }
        }
    }
    public double countTotalCost(){
        double totalProductsCost = 0;
        for (Product product:products){
          return totalProductsCost += product.getPricePerUnit() * product.getQuantity();
        }
        return totalProductsCost;
    }
    public void makeAnOrder(User user, ArrayList<Product> products){
        Order order = new Order(user);
        for (Product product:products) {
            order.addProduct(product);

        }
        orders.add(order);

    }
    public void processSale(Order order) {
        for (Product product:order.getProducts()) {
            for (Product storageItem:products) {
                if(storageItem.equals(product.getName())){
//                   убрать товар из магазина и добавить его в заказ пользователя????

            }
//            сформированный заказ удалять из магазина и передать пользователю???
        }

    }

    }
    public void showInfo(){
        System.out.println("Сформированный заказ");
        for (Order order:orders) {
            System.out.println("- Пользователь: " + order.getUser().getUsername());
            System.out.println("- Сумма заказа: " + order.calculateTotalCost());
            System.out.println("- Корзина товаров: ");
            for (Product product: order.getProducts()){
                System.out.println(product.getName() + "- " + product.getPricePerUnit());
            }
        }

    }
}
