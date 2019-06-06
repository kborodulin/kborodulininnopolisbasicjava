package ru.kborodulin.task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int compareGetName = person1.getName().compareTo(person2.getName());
        if (compareGetName != 0) return compareGetName;
        return person1.getAge() - person2.getAge();
    }
}