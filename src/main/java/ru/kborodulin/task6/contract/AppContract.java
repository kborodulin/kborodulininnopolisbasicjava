package ru.kborodulin.task6.contract;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 4. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 */
public class AppContract {
    public static void main(String[] args) {
        // Создаем договор
        Agreement agreement = new Agreement(
                "st12345",
                LocalDate.now(),
                "Продавец Тест1",
                "Покупатель Тест2",
                Arrays.asList("Товар1", "Товар2", "Товар3")
        );

        // Распечатаем договор
        System.out.println(agreement);

        // Конвертируем договор в акт
        Act act = AgreementAct.convert(agreement);

        // Распечатаем акт
        System.out.println(act);
    }
}