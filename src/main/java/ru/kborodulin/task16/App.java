package ru.kborodulin.task16;

/**
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 * Задачу не зачитывать если использованы утильные методы класса Arrays.
 * Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 */
public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Массив до реверса
        printArray(array);

        // Реверс
        reverseArray(array);

        // Массив после реверса
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println("");
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }
}