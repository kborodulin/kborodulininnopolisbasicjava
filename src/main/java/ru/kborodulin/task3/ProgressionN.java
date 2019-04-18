package ru.kborodulin.task3;

/**
 * Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
 */
public class ProgressionN {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"5", "3", "5"}; //{первое значение, шаг, количество чисел}
        }
        int a1 = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int a = 0;
        int b = 0;

        System.out.print("Арифметическая прогрессия: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                a = a1;
                System.out.print(a + " ");
                continue;
            }
            System.out.print((a += d) + " ");
        }

        System.out.print("\nГеометрическая прогрессия: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                b = a1;
                System.out.print(b + " ");
                continue;
            }
            System.out.print((b *= d) + " ");
        }
    }
}
