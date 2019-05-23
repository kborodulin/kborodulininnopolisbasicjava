package ru.kborodulin.task11;

import lombok.*;

import java.io.*;

@RequiredArgsConstructor
@ToString
public class Book implements Serializable {
    private static final long serialVersionUID = -2391643541883338091L;

    @Getter
    @Setter
    @NonNull
    private String nameBook;

    @Getter
    @Setter
    @NonNull
    private String author;

    @Getter
    @Setter
    @NonNull
    private int yearPublication;

    @Getter
    @Setter
    private String content;
}