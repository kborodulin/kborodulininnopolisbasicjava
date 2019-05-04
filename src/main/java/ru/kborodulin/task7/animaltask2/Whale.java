package ru.kborodulin.task7.animaltask2;

public class Whale extends Animal implements Swim {
    @Override
    public void getName() {
        System.out.println("Кит");
    }

    @Override
    public void swim() {
        System.out.println("Кит плывет");
    }
}
