package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать консольное Java-приложение «Горячо-Холодно»
 * <p>
 * Вначале программа «загадывает» случайное число от 1 до 100.
 * Пользователь вводит с консоли число.
 * Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
 * И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
 * Для первого ввода пользователя считаем предыдущим введенным числом 0.
 * Предусмотреть возможность выхода из игры до отгадывания числа.
 */
public class HotCold {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int randomNumber = (int) (Math.random() * 100) + 1;
        int minNumber = 0;
        int maxNumber = 101;

        while (true) {
            String str = reader.readLine();
            if (str.equals("exit")) {
                System.out.println("Выход из игры!!!");
                break;
            }

            int userNumber = Integer.parseInt(str);
            if (userNumber == randomNumber) {
                System.out.println("Вы выиграли!!!");
                break;
            }

            if (userNumber >= minNumber && userNumber < randomNumber) {
                System.out.println("горячо");
                minNumber = userNumber;
                continue;
            }

            if (userNumber <= maxNumber && userNumber > randomNumber) {
                System.out.println("горячо");
                maxNumber = userNumber;
                continue;
            }

            System.out.println("холодно");
        }
    }
}
