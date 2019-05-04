package ru.kborodulin.task7.human;

public class HumanOne extends Human {
    @Override
    public void fastRun() {
        System.out.println("Быстро бегать");
    }

    @Override
    public void slowRun() {
        System.out.println("Медленно бегать");
    }

    @Override
    public void fastSwim() {
        System.out.println("Быстро плавать");
    }

    @Override
    public void slowSwim() {
        System.out.println("Медленно плавать");
    }
}