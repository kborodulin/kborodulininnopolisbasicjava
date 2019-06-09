package ru.kborodulin.task24;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * task24
 * ДЗ_24_Фильтрация множества элементов
 * Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
 * public Set<String> removeEvenLength(Set<String> set);
 * Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
 */
public class App {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet();
        Collections.addAll(stringSet, "foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        SetFiltering setFiltering = new SetFiltering();
        setFiltering.removeEvenLength(stringSet);
        for (String line : stringSet) {
            System.out.print(line + " ");
        }
    }
}