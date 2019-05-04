package ru.kborodulin.task7.animaltask2;

public class Duck extends Animal implements Fly, Run, Swim {
    @Override
    public void getName() {
        System.out.println("Утка");
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
