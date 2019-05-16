package ru.kborodulin.task5.vm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Система ввода/вывода вендинг машины
 */
public class IOVendingMachine {
    public static String readTerminal() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}