package ru.kborodulin.task6.counter;

/**
 * 3. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов. Написать метод для
 * получения информации о количестве.
 */
public class AppCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();

        for (int row = 0; row < 10; row++) {
            new Counter();
        }
    }
}
