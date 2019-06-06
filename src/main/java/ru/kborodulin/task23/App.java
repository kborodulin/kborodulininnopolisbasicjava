package ru.kborodulin.task23;

/**
 * 23_ДЗ_Реализация корзины интернет магазина
 * Реализовать класс корзины интернет магазина по следующему интерфейсу:
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
 * List<String> getProductsList();
 * <p>
 * int getProductQuantity(String product);
 * <p>
 * }
 */
public class App {
    public static void main(String[] args) {
        BasketOnlineStore basketOnlineStore = new BasketOnlineStore();
        basketOnlineStore.addProduct("Продукт1", 100);
        basketOnlineStore.addProduct("Продукт2", 50);
        basketOnlineStore.addProduct("Продукт3", 70);
        basketOnlineStore.addProduct("Продукт4", 10000);

        for (String product : basketOnlineStore.getProductsList()) {
            System.out.println(product + " " + basketOnlineStore.getProductQuantity(product));
        }

        basketOnlineStore.removeProduct("Продукт3");
        basketOnlineStore.updateProductQuantity("Продукт2", 224242);

        for (String product : basketOnlineStore.getProductsList()) {
            System.out.println(product + " " + basketOnlineStore.getProductQuantity(product));
        }
    }
}