package ru.kborodulin.task24;

import java.util.Iterator;
import java.util.Set;

public class SetFiltering {
    // 1 способ
    public Set<String> removeEvenLength1(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

    // 2 способ
    public Set<String> removeEvenLength2(Set<String> set) {
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

    // 3 способ
    public Set<String> removeEvenLength3(Set<String> set) {
        set.removeIf(x -> x.length() % 2 == 0);
        return set;
    }
}