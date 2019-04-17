package ru.kborodulin.task3;

/**
 * Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое),
 * чётное или нечётное.
 */
public class DescriptionNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"-50"};
        }
        int num = Integer.parseInt(args[0]);

        System.out.print("Число ");

        if (num > 0) {
            System.out.print("положительное ");
        } else if (num < 0) {
            System.out.print("отрицательное ");
        } else {
            System.out.print("нулевое ");
        }

        System.out.print("/ ");

        if (num % 2 == 0) {
            System.out.print("чётное");
        } else {
            System.out.print("нечётное");
        }
    }
}
