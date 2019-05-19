package ru.kborodulin.task5.vm;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Справочник напитков
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public enum Drink {
    BLACKTEA("Черный чай", 50),
    GREENTEA("Зеленый чай", 45),
    COFFEE("Кофе", 100),
    COCACOLA("Кола", 70),
    FANTA("Фанта", 70),
    SPRITE("Спрайт", 70),
    APPLEJUICE("Яблочный сок", 80),
    ORANGEJUICE("Апельсиновый сок", 80);

    private final String namedrink;
    private final double momeyDrink;
}