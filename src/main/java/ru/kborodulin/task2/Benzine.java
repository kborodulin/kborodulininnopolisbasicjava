package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benzine {
    public static final int COSTLITERBENS = 43;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double amountBens = Double.parseDouble(reader.readLine());
        System.out.println(amountBens * COSTLITERBENS + " руб");
    }
}