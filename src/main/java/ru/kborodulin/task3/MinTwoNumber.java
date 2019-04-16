package ru.kborodulin.task3;

/**
 * Написать программу для поиска минимального из двух чисел.
 */
public class MinTwoNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"500.5", "300.4"};
        }
        Double num1 = Double.valueOf(args[0]);
        Double num2 = Double.valueOf(args[1]);
        Double minNumber = num1 > num2 ? num2 : num1;
        System.out.println(minNumber);
    }
}