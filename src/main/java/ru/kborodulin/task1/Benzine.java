package ru.kborodulin.task1;

/**
 * программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается стоимость).
 * Пример: стоимость литра бензина 43 рубля. На вход подается 50, на выходе должно быть 2150 руб.
 */
public class Benzine {
    public static final int COSTLITERBENS = 43;

    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"50"};
        }
        Double amountBens = Double.valueOf(args[0]);
        System.out.println(amountBens * COSTLITERBENS + " руб");
    }
}
