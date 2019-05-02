package ru.kborodulin.task6.counter;

public class Counter {
    private static int counter;

    public Counter() {
        count();
    }

    public void count() {
        counter++;
        System.out.println("Количество созданных объктов: " + counter);
    }
}