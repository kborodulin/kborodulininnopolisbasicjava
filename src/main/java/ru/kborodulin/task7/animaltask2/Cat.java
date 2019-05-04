package ru.kborodulin.task7.animaltask2;

public class Cat extends Animal implements Run {
    @Override
    public void getName() {
        System.out.println("Кошка");
    }

    @Override
    public void run() {
        System.out.println("Кошка бегает");
    }
}
