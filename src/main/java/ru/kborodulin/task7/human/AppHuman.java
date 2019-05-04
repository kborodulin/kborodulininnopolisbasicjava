package ru.kborodulin.task7.human;

/**
 * 3. Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
 * Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
 */

public class AppHuman {
    public static void main(String[] args) {
        Human one = new HumanOne();
        one.fastRun();
        one.slowSwim();
    }
}
