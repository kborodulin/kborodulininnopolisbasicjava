package ru.kborodulin.task3;

/**
 * С лекции доп задание перевернуть слово
 */
public class WordTurn {
    public static void main(String[] args) {
        String s = "сегодня";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
