package ru.kborodulin.task13;

import java.io.IOException;

/**
 * Кассовый чек
 * <p>
 * Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
 * <p>
 * Формат файла:
 * <p>
 * Название товара
 * количество
 * цена
 * <p>
 * Необходимо написать программу, которая выведет на экран чек, сформированный из этого файла. В чеке должна быть информация:
 * <p>
 * название товара:  цена Х кол-во = стоимость
 * <p>
 * В конце отчета вывести итоговую стоимость.
 * <p>
 * Пример входного файла и вывода прикрепляю к задаче
 */
public class App {
    public static void main(String[] args) throws IOException {
        PageFormat pageFormat = new PageFormat();
        System.out.println(pageFormat.formattedPage());
    }
}
