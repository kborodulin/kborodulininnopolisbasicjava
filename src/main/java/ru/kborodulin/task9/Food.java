package ru.kborodulin.task9;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Справочник еды
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public enum Food {
    CARROT("Морковь"),
    APPLE("Яблоко"),
    PORRIDGE("Каша"),
    BROCCOLI("Броколли"),
    PEAR("Груша");

    private final String nameFood;
}