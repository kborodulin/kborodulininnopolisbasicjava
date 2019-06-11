package ru.kborodulin.task25_2;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class BasketOnlineStore implements Basket {
    private Map<String, Integer> basketMap = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        basketMap.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basketMap.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basketMap.replace(product, quantity);

    }

    @Override
    public void clear() {
        basketMap.clear();
    }

    @Override
    public List<String> getProducts() {
        // 1 способ
        return basketMap
                .keySet()
                .stream()
                .collect(Collectors.toList());

        // 2 способ
        //return new ArrayList<>(basketMap.keySet());

        // 3 способ
        /* return basketMap
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()); */
    }

    @Override
    public int getProductQuantity(String product) {
        return basketMap.get(product);
    }
}