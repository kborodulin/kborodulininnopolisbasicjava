package ru.kborodulin.task5.vm;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Купюроприемник
 */
@Data
public class MoneyReceiver {
    public static int numListOperation() {
        int numOperation = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            numOperation = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numOperation;
    }

    public static double addMoney() {
        double money = 0d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            money = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return money;
    }
}