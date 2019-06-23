package ru.kborodulin.task29;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private int age;
    private String surname;
    private String gender;
}