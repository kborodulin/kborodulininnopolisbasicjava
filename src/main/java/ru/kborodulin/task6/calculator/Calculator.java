package ru.kborodulin.task6.calculator;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class Calculator {
    public static int addition(int num1, int num2) {
        int num = num1 + num2;
        System.out.println("intAddition: " + num);
        return num;
    }

    public static double addition(double num1, double num2) {
        double num = num1 + num2;
        System.out.println("doubleAddition: " + num);
        return num;
    }

    public static int subtraction(int num1, int num2) {
        int num = num1 - num2;
        System.out.println("intSubtraction: " + num);
        return num;
    }

    public static double subtraction(double num1, double num2) {
        double num = num1 - num2;
        BigDecimal numbd = new BigDecimal(num).setScale(2, ROUND_HALF_UP);
        System.out.println("doubleSubtraction: " + numbd);
        return numbd.doubleValue();
    }

    public static int multiply(int num1, int num2) {
        int num = num1 * num2;
        System.out.println("intMultiply: " + num);
        return num;
    }

    public static double multiply(double num1, double num2) {
        double num = num1 * num2;
        BigDecimal numbd = new BigDecimal(num).setScale(2, ROUND_HALF_UP);
        System.out.println("doubleMultiply: " + numbd);
        return numbd.doubleValue();
    }

    public static int division(int num1, int num2) {
        int num = num1 / num2;
        System.out.println("intDivision: " + num);
        return num;
    }

    public static double division(double num1, double num2) {
        double num = num1 / num2;
        BigDecimal numbd = new BigDecimal(num).setScale(2, ROUND_HALF_UP);
        System.out.println("doubleDivision: " + numbd);
        return numbd.doubleValue();
    }

    public static int percentNumber(int num1, int num2) {
        int num = num1 / 100 * num2;
        System.out.println("intDivision: " + num);
        return num;
    }

    public static double percentNumber(double num1, double num2) {
        double num = num1 / 100 * num2;
        BigDecimal numbd = new BigDecimal(num).setScale(2, ROUND_HALF_UP);
        System.out.println("doubleDivision: " + numbd);
        return numbd.doubleValue();
    }
}