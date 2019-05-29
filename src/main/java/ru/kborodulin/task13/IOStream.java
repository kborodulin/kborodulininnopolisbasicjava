package ru.kborodulin.task13;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Операции с файлом
 */
@Data
public class IOStream {
    private final String fileName = "products.txt";

    /**
     * Чтение файла
     */
    public void readFile(ProductList productList) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            while (reader.ready()) {
                productList.fillListProducts(reader.readLine());
            }
        }
    }
}