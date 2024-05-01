import store.Product;
import store.Store;
import store.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner input = new Scanner(System.in);
        while (true) {
            printMenu();
            int taskNumber = input.nextInt();
            switch (taskNumber) {
                case 1 -> System.out.println("Введите товар:");
                System.out.print("Название товара: ");
                String name = input.nextLine();
                System.out.print("Категория: ");
                String category = input.nextLine();
                System.out.print("Количество: ");
                int quantity = input.nextInt();
                System.out.print("Цена за шт: ");
                double pricePerUnit = input.nextDouble();
                Product product = new Product(name, category, quantity, pricePerUnit);
                store.addProductToStore(product);
                System.out.println("Товары добавлены в магазин");
                break;

                case 2 -> System.out.print("Введите название товара для удаления: ");
                String productName = input.nextLine();

//                    Product removedProduct = store.removeProductFromStore(productName);
                    if (removedProduct != null) {
                        System.out.println("Товар удален из магазина");
                    } else {
                        System.out.println("Товар не найден в магазине");
                    }
                }
                break;

                case 3 -> System.out.print("Введите название товара для обновления количества: ");
                String productNameToUpdate = input.nextLine();
                System.out.print("Введите новое количество товара:");
                int updatedQuantity = input.nextInt();
                store.updateAmountOfProducts(product, updatedQuantity);
                System.out.println("Количество товара изменено");
                break;

                case 4 -> System.out.print("Введите название категории товаров ");
                String categoryToDisplay = input.nextLine();
                store.showProductByCategory(categoryToDisplay);
                break;

                case 5 ->
                double totalCost = store.countTotalCost();
                System.out.println("Общая стоимость всех товаров на складе: " + totalCost);
                break;

                case 6 -> System.out.print("Введите имя пользователя: ");
                String username = input.nextLine();
                System.out.print("Введите email пользователя : ");
                String email = input.nextLine();
                User user = new User(username, email);

                ArrayList<Product> orderProducts1 = new ArrayList<>();
                store.makeAnOrder(user, orderProducts1);
                System.out.println("Заказ сформирован");
//                   /...тотальное непонимание как дальше сделать processSale
//                доделать
                break;
            }
                case 7 ->
                        System.out.println("Все заказы:");
                store.showInfo();
                break;

            case 0 -> {
                return;
            }
            default -> System.out.println("Некорректный ввод");
        }
    }

    static void printMenu() {
        System.out.println("1.Добавление товара в инвентарь");
        System.out.println("2.Удаление товара из инвентаря");
        System.out.println("3.Обновление количества товара в инвентаре");
        System.out.println("4.Вывод всех товаров определенной категории");
        System.out.println("5.Вычисление общей стоимости всех товаров на складе");
        System.out.println("6.Создание заказа от пользователя");
        System.out.println("7.Вывод информации о всех заказах");
        System.out.println("0.Выйти из приложения");
    }
}


    }
}