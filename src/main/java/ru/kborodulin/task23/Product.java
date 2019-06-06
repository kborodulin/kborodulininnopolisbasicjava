package ru.kborodulin.task23;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String product;
    private int quantity;
}