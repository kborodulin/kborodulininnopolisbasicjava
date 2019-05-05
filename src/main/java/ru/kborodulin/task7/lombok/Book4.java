package ru.kborodulin.task7.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book4 {
    private int id;
    @NonNull
    private String name;
    private String author;
}
