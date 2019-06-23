package ru.kborodulin.task29;

import java.util.Map;

/**
 * Реализовать метод removeTheDuplicates по поиску дубликатов в исходной мапе, затем при нахождении дубликата
 * удалить его из исходной мапы используя метод
 * removeItemFromMapByValue(Map<String, Person> map, Person value)
 */
public class App {
    public static void main(String[] args) {
        Map<String, Person> personMap = HashMapPerson.createMap();
        HashMapPerson.removeTheDuplicates(personMap);
        personMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}