package ru.kborodulin.task1;

/**
 * программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе печатается
 * зарплата за вычетом 13% (НДФЛ). Пример: на вход подается 70000, на выходе печатается 60900 руб.
 */
public class Salary {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"50"};
        }
        Double salaryDirty = Double.valueOf(args[0]);
        Double salaryNet = salaryDirty - (salaryDirty * 0.13);
        System.out.println(salaryNet + " руб");
    }
}
