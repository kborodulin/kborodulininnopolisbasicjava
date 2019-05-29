package ru.kborodulin.task13;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Операции с массивом продуктов
 */
@Data
public class ProductList {
    private List<Product> listProducts = new ArrayList<>();
    private Product product;
    private int line = 1;

    /**
     * Заполняем массив продуктов при чтении файла
     */
    public List<Product> fillListProducts(String readerFile) {
        switch (line) {
            case 1: {
                product = new Product();
                product.setNameProduct(readerFile);
                line = 2;
                break;
            }
            case 2:
                product.setCountProduct(Double.valueOf(readerFile));
                line = 3;
                break;
            case 3:
                product.setPriceProduct(Double.valueOf(readerFile));
                listProducts.add(product);
                line = 1;
                break;
        }
        return listProducts;
    }

    /**
     * Итого
     */
    public double totalSumProducts() {
        double sum = 0d;
        for (Product product : listProducts) {
            sum += product.getCountProduct() * product.getPriceProduct();
        }
        return sum;
    }
}