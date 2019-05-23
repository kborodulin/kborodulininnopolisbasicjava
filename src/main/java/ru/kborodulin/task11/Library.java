package ru.kborodulin.task11;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private static final long serialVersionUID = 8424800472935499218L;

    @Getter
    @Setter
    private List<Book> libraryBook = new ArrayList<>();

    public List<Book> addBookLibrary(Book book) {
        libraryBook.add(book);
        return libraryBook;
    }

    public static void saveLibrary(Library library) throws IOException {
        try (OutputStream os = new FileOutputStream(FileOperation.getFileName());
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(library);
        }
    }

    public static Library loadLibrary() throws IOException, ClassNotFoundException {
        try (InputStream is = new FileInputStream(FileOperation.getFileName());
             ObjectInputStream ois = new ObjectInputStream(is)) {
            Library library = (Library) ois.readObject();
            return library;
        }
    }

    public static void printLibrary(Library library) {
        if (library != null) {
            for (Book book : library.getLibraryBook()) {
                System.out.println(book);
            }
        }
    }
}