package ru.kborodulin.task7.animal_task1;

/**
 * 1. Написать абстрактный класс Animal с абстрактным методом getName.
 * Сделать несколько классов животных, наследников Animal.
 * Метод getName должен выводит название каждого животного.
 */
public class AppAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.getName();
        Animal dog = new Dog();
        dog.getName();
        Animal whale = new Whale();
        whale.getName();
    }
}