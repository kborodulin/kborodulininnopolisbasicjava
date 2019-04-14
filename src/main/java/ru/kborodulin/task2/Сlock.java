package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Сlock {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double second = Double.parseDouble(reader.readLine());
        double hour = second / 60 / 60;
        System.out.println(Math.round(hour) + " час");
    }
}