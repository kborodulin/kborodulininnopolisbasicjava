package ru.kborodulin.task25_1;

import java.util.HashMap;
import java.util.Map;

/**
 * 25_ДЗ_1_Фильтр мапы
 * <p>
 * public boolean isUnique(Map<String, String> map);
 * <p>
 * Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
 * <p>
 * Для пустой мапы метод возвращает true.
 * <p>
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * <p>
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 */
public class App {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Вася", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");

        Map<String, String> map3 = new HashMap<>();

        FilterMap filterMap = new FilterMap();
        System.out.println(filterMap.isUnique(map1));
        System.out.println(filterMap.isUnique(map2));
        System.out.println(filterMap.isUnique(map3));
    }
}
