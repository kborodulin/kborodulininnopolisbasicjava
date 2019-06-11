package ru.kborodulin.task25_2;

/**
 * 25_ДЗ_2_Корзина с использованием мапы
 * Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
 * <p>
 * interface Basket {
 * <p>
 * void addProduct(String product, int quantity);
 * <p>
 * void removeProduct(String product);
 * <p>
 * void updateProductQuantity(String product, int quantity);
 * <p>
 * void clear();
 * <p>
 * List<String> getProducts();
 * <p>
 * int getProductQuantity(String product);
 * <p>
 * }
 */
public class App {
    public static void main(String[] args) {
        BasketOnlineStore basketOnlineStore = new BasketOnlineStore();
        basketOnlineStore.addProduct("test1", 100);
        basketOnlineStore.addProduct("test2", 200);
        basketOnlineStore.addProduct("test3", 300);
        basketOnlineStore.addProduct("test4", 400);
        basketOnlineStore.addProduct("test5", 500);

        for (String line : basketOnlineStore.getProducts()) {
            System.out.println(line + " " + basketOnlineStore.getProductQuantity(line));
        }

        basketOnlineStore.removeProduct("test2");
        basketOnlineStore.updateProductQuantity("test4", 800);
        System.out.println("--------------------------------");

        for (String line : basketOnlineStore.getProducts()) {
            System.out.println(line + " " + basketOnlineStore.getProductQuantity(line));
        }

    }
}