package ru.kborodulin.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private static List<Deposit> listDeposit = new ArrayList<>();

    // Заполняем справочник вкладов
    static {
        listDeposit.add(new Deposit("Вклад1", 3.5));
        listDeposit.add(new Deposit("Вклад2", 4.5));
        listDeposit.add(new Deposit("Вклад3", 5.5));
    }

    public static void main(String[] args) {
        // Создаем первого клиента и открываем вклад
        Client client1 = new Client("Иванов", "Иван", "Иванович", LocalDate.of(1990, 01, 01), "1234567891");
        ClientDeposit clientDeposid1 = new ClientDeposit(client1, listDeposit.get(2), 5000);
        System.out.println(clientDeposid1);

        // Создаем второго клиента и открываем вклад
        Client client2 = new Client("Иванов", "Иван", "Иванович", LocalDate.of(1990, 01, 01), "1234567891");
        ClientDeposit clientDeposid2 = new ClientDeposit(client1, listDeposit.get(0), 10000);
        System.out.println(clientDeposid2);

        // Закрываем вклад для первого клиента
        clientDeposid1.clientDepositClose(clientDeposid1);
    }
}
