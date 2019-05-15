package ru.kborodulin.task5.vm;

import lombok.Data;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Купюроприемник
 */
@Data
public class MoneyReceiver {
    public static List<String> listOperation() {
        List<String> listOperation = new ArrayList();
        listOperation.add("1 - Повторно вывести список операций");
        listOperation.add("2 - Внести деньги на счет");
        listOperation.add("3 - Довнести деньги на счет");
        listOperation.add("4 - Получить напиток по его номеру");
        listOperation.add("5 - Выдать сдачу");
        listOperation.add("6 - Завершить обслуживание");
        return listOperation;
    }

    public static int numListOperation() {
        int numOperation = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            numOperation = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введите номер операции в виде целого числа");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOperation;
    }

    public static double addMoney() {
        double money = 0d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            money = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введите сумму денег в виде дробного числа");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return money;
    }
}