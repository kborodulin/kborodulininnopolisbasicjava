package ru.kborodulin.task5.vm;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Система ввода/вывода вендинг машины
 */
@Slf4j
public class IOVendingMachine {
    public static String readTerminal() throws IOException {
        log.debug("Создание потока чтения данных с консоли");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}