package ru.kborodulin.task29;

import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class HashMapPerson {
    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        // 1 способ
        map.values()
                .stream()
                .filter(x -> Collections.frequency(map.values(), x) > 1)
                .collect(Collectors.toList())
                .forEach(value -> removeItemFromMapByValue(map, value));

        // 2 способ
        // Создаем копию мапы, иначе ошибка java.util.ConcurrentModificationException
        /* HashMap<String, Person> personHashMap = new HashMap<String, Person>(map);
        for (Map.Entry<String, Person> pair : personHashMap.entrySet()) {
            if (Collections.frequency(personHashMap.values(), pair.getValue()) > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }*/
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}