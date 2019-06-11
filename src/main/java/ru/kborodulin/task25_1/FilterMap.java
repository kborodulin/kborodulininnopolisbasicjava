package ru.kborodulin.task25_1;

import java.util.Map;

public class FilterMap {
    public boolean isUnique(Map<String, String> map) {
        long num1 = map.values()
                .stream()
                .count();

        long num2 = map.values()
                .stream()
                .distinct()
                .count();

        if (num1 == num2) {
            return true;
        }

        return false;
    }
}