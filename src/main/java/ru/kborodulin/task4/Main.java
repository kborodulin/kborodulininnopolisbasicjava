package ru.kborodulin.task4;

import java.time.LocalDate;

/**
 * Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
 *
 * Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
 *
 * Ограничения:
 *
 *     Минимум 3 класса
 *     Наличие нескольких полей и методов
 *     Использование модификаторов доступа
 *     Использование принципов ООП
 */

public class Main {
    public static void main(String[] args) {
        // Клиент 1. Новый клиент
        Client client1 = new Client("Иванов", "Иван", "Иванович", LocalDate.of(1990, 01, 01), "1234567891");
        // Клиент 2. Новый клиент
        Client client2 = new Client("Казаков", "Антон", "Сергеевич", LocalDate.of(1980, 02, 02), "9876543210");
        // Клиент 2. Изменяем клиента
        client2.renameClient("Петров", "Петр", "Петрович", LocalDate.of(2000, 05, 05), "1111111111");
        // Вклад
        ViewDeposit deposit1 = new ViewDeposit("vklad1");
        ViewDeposit deposit2 = new ViewDeposit("vklad2");
        // Открытие вклада
        DepositClient depositClient1 = new DepositClient(client1, deposit1);
        DepositClient depositClient2 = new DepositClient(client2, deposit2);
    }
}
