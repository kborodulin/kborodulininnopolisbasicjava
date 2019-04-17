package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается стоимость).
 * Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.
 */
public class Benzine {
    public static final int COSTLITERBENS = 43;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double amountBens = Double.parseDouble(reader.readLine());
        System.out.println(amountBens * COSTLITERBENS + " руб");
    }
}