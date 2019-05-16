package ru.kborodulin.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу "воспитанный ребенок".
 * <p>
 * Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
 * Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой».
 * Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
 * <p>
 * - Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д.
 * - Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду.
 * В методе происходит сравнение поступившей еды с вкусовыми предпочтениями и в случае если они не совпадают,
 * выбрасывается исключение. «Одобренная» ребенком еда съедается: возвращается сообщение «съел … за обе щеки».
 * - Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама».
 * - Создать главный класс и метод main - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Child child = new Child();

        System.out.println("Список значений возможной еды:");
        for (Food food : Food.values()) {
            System.out.println(food.name());
        }

        while (true) {
            System.out.print("Введите еду из списка: ");

            String food = reader.readLine();
            if ("exit".equals(food)) {
                break;
            }

            try {
                System.out.println(child.eat(Food.valueOf(food)));
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка выбора еды из списка возможных значений!!!");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "; " + child.getStr());
            }
        }
    }
}