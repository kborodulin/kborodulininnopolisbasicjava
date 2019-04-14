package ru.kborodulin.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double salaryDirty = Double.parseDouble(reader.readLine());
        double salaryNet = salaryDirty - (salaryDirty * 0.13);
        System.out.println(Math.round(salaryNet) + " руб");
    }
}