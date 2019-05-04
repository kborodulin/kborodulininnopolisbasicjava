package ru.kborodulin.task7.animaltask2;

/**
 * 2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
 * Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
 * Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
 */
public class AppAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();

        Whale whale = new Whale();
        whale.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();
    }
}