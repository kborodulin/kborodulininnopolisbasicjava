package ru.kborodulin.task9;

import lombok.Getter;

/**
 * Ребенок
 */
@Getter
public class Child {
    private String str;

    public String eat(Food food) throws Exception {
        switch (food) {
            case APPLE:
            case PEAR:
                str = "съел … за обе щеки; спасибо, мама";
                break;
            default:
                try {
                    throw new Exception("еда не нравится");
                } finally {
                    str = "спасибо, мама";
                }
        }
        return str;
    }
}