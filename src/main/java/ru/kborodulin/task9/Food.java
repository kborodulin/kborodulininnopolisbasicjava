package ru.kborodulin.task9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Справочник еды
 */
@AllArgsConstructor
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