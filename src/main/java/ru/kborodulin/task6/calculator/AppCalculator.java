package ru.kborodulin.task6.calculator;

/**
 * 2. Реализовать класс AppCalculator, который будет содержать статические методы для операций вычитания, сложения, умножения,
 * деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.
 */

public class AppCalculator {
    public static void main(String[] args) {
        System.out.println("Сложение:");
        int num1 = Calculator.addition(10, 10);
        double num2 = Calculator.addition(10.4, 10);
        double num3 = Calculator.addition(10.4, 10.6);
        System.out.println("-------------------------");

        System.out.println("Вычитание:");
        int num11 = Calculator.subtraction(12, 10);
        double num12 = Calculator.subtraction(10.4, 10);
        double num13 = Calculator.subtraction(10.4, 10.6);
        System.out.println("-------------------------");

        System.out.println("Умножение:");
        int num21 = Calculator.multiply(12, 10);
        double num22 = Calculator.multiply(10.4, 10);
        double num23 = Calculator.multiply(10.4, 10.6);
        System.out.println("-------------------------");

        System.out.println("Деление:");
        int num31 = Calculator.division(15, 4);
        double num32 = Calculator.division(10.4, 10);
        double num33 = Calculator.division(10.4, 10.6);
        System.out.println("-------------------------");

        System.out.println("Взятия процента от числа:");
        int num41 = Calculator.percentNumber(200, 50);
        double num42 = Calculator.percentNumber(10.4, 10);
        double num43 = Calculator.percentNumber(10.4, 10.6);
        System.out.println("-------------------------");
    }
}
