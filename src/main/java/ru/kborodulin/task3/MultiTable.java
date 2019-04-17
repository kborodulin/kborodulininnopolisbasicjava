package ru.kborodulin.task3;

/**
 * Написать программу для вывода на экран таблицы умножения.
 */
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.printf("%5s", i * k);
            }
            System.out.println();
        }
    }
}
