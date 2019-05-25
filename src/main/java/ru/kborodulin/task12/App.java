package ru.kborodulin.task12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Написать програму, которая копирует файл с одной кодировкой в файл с другой.
 */
public class App {
    public static void main(String[] args) throws IOException {
        // Создаем файл с данными
        FileOperation.newFile("temp1.txt");
        IOStream.addLineFile(FileOperation.getFileName(), "Windows-1251", Arrays.asList("Тест1", "Test2", "Тест 12345"));
        // Сохраняем в новой кодировке
        List<String> line = new ArrayList<>();
        line = IOStream.readLineFile(FileOperation.getFileName(), "Windows-1251");
        FileOperation.newFile("temp2.txt");
        IOStream.addLineFile(FileOperation.getFileName(), "UTF-8", line);
    }
}