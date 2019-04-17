package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе печатается
 * зарплата за вычетом 13% (НДФЛ). Пример: на вход подается 70000, на выходе печатается 60900 руб.
 */
public class Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double salaryDirty = Double.parseDouble(reader.readLine());
        double salaryNet = salaryDirty - (salaryDirty * 0.13);
        System.out.println(Math.round(salaryNet) + " руб");
    }
}