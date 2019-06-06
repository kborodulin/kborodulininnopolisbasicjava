package ru.kborodulin.task23;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BasketOnlineStore implements Basket {
    private List<Product> products = new ArrayList<>();
    private Product product;

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).getProduct().equals(product)) {
                products.remove(index);
                return;
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).getProduct().equals(product)) {
                products.get(index).setProduct(product);
                products.get(index).setQuantity(quantity);
                return;
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProductsList() {
        List<String> stringList = new ArrayList<>();
        for (Product product : products) {
            stringList.add(product.getProduct());
        }
        return stringList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product product1 : products) {
            if (product1.getProduct().equals(product)) {
                return product1.getQuantity();
            }
        }
        return 0;
    }
}