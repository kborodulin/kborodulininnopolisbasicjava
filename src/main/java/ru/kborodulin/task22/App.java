package ru.kborodulin.task22;

import java.util.ArrayList;
import java.util.List;

/**
 * 22_Реализация сложного компаратора
 * Написать класс PersonSuperComparator,
 * который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
 * Класс Person теперь содержит два поля int age и String name
 */
public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Тест5", 10));
        personList.add(new Person("Тест5", 5));
        personList.add(new Person("АА", 75));
        personList.add(new Person("АА", 60));
        personList.add(new Person("АА", 0));
        personList.add(new Person("Тест3", 12));
        personList.add(new Person("Тест3", 12));
        personList.add(new Person("Person3", 15));
        personList.add(new Person("Person3", 12));
        personList.add(new Person("Test12", 12));
        personList.add(new Person("Test10", 0));

        personList.sort(new PersonSuperComparator());

        for (Person person : personList) {
            System.out.println((person));
        }
    }
}