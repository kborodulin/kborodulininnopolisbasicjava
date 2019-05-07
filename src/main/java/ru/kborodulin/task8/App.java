package ru.kborodulin.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу которая получает на вход некую строку , после она вызывает метод,
 * заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль!
 */
public class App {
    public static void main(String[] args) throws IOException {
        // тестовыйбякатестбякабякатест1тест2тест3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(replaceWord(reader.readLine()));
    }

    public static String replaceWord(String word) {
        return word.replace("бяка", "«вырезано цензурой»");
    }
}