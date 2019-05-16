package ru.kborodulin.task5.vm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Система ввода/вывода вендинг машины
 */
public class IOVendingMachine {
    private static final Logger logger = LoggerFactory.getLogger(MoneyReceiver.class);

    public static String readTerminal() throws IOException {
        logger.debug("Создание потока чтения данных с консоли");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}