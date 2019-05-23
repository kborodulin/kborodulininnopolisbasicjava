package ru.kborodulin.task11;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
 * <p>
 * Программа должна уметь:
 * <p>
 * добавлять книгу в библиотеку.
 * показывать список книг в библиотеке.
 * восстанавливать содержимое библиотеки после перезапуска.
 * показывать соответствующее сообщение в случае ошибок.
 * <p>
 * Важно!
 * <p>
 * потоки обязательно должны закрываться
 * отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
 */
public class App {
    public static void main(String[] args) {
        // Создадим файл для сериализацим
        try {
            FileOperation.newFile("Library.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Загрузим библиотеку из файла после перезапуска
        Library library = null;
        try {
            library = Library.loadLibrary();
        } catch (EOFException e) {
            System.out.println("Библиотека пустая!!!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Распечатаем библиотеку
        Library.printLibrary(library);

        // Загрузим книги в библиотеку
        if (library == null) {
            library = new Library();
        }
        library.addBookLibrary(new Book("Пока течет река", "Сеттерфилд", 2019));
        library.addBookLibrary(new Book("Java SE 8 Базовый курс", "Хорстманн", 2015));
        library.addBookLibrary(new Book("Java 8. Полное руководство 9", "Шилдт", 2015));

        // Сохраним библиотеку в файл
        try {
            Library.saveLibrary(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}