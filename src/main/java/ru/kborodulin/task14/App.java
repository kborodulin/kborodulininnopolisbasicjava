package ru.kborodulin.task14;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Есть набор бесплатных сервисов в интернете, предоставляющих данные в формате JSON:
 * <p>
 * https://github.com/toddmotto/public-apis/blob/master/README.md
 * <p>
 * Выбрать любой сервис, какой больше нравится, и написать программу, которая с ним взаимодействует.
 * <p>
 * Класс сериализуемого объекта может содержать не все поля, а только 2-3 ключевых. Например, для погоды достаточно показать диапазон температур.
 * Минимальное количество запросов к сервису - 1. Не обязательно реализовывать весь функционал, предоставляемый сервисом. Достаточного одного любого запроса
 */
public class App {
    private final static String URLADDRESS = "http://api.icndb.com/jokes/random?firstName=John&amp;lastName=Doe";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonTest json;
        URL url = new URL(URLADDRESS);
        try (BufferedReader readerURL = new BufferedReader(new InputStreamReader(url.openStream()))) {
            json = objectMapper.readValue(readerURL, JsonTest.class);
        }
        System.out.println(json);
    }
}
