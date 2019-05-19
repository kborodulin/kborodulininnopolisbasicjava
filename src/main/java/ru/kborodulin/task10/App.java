package ru.kborodulin.task10;

import java.io.IOException;

/**
 * Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
 * Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
 * Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
 * сдвигая название файла/каталога на соответствующее количество пробелов.
 */
public class App {
    public static void main(String[] args) {
      /*  try {
            System.out.println(FileOperation.newFile("C:\\temp", "тест.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(FileOperation.renameFile("C:\\temp", "тест.txt", "test5.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(FileOperation.copyFile("C:\\temp\\test5.txt", "c:\\temp\\1\\test5.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(FileOperation.deleteFile("C:\\temp", "test5.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } */

        try {
            System.out.println(FileOperation.recursive("C:\\temp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}