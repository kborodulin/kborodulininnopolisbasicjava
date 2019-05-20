package ru.kborodulin.task10;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Рекурсивный обход всех файлов и подкаталогов внутри заданного каталога
 */
public class RecursiveFile {
    private static Path rootPath;

    /**
     * Уровень вложенности от заданного каталога
     */
    public static int nestingLevel(String rootPath, String fullPath) {
        int countSeparatorRootPath = rootPath.length() - rootPath.replace(String.valueOf(File.separatorChar), "").length();
        int countSeparatorFullPath = fullPath.length() - fullPath.replace(String.valueOf(File.separatorChar), "").length();
        return countSeparatorFullPath - countSeparatorRootPath;
    }

    /**
     * Строка пробелов с учетом уровня вложенности
     */
    public static String countSpace(int level, int space) {
        StringBuilder sb = new StringBuilder("");
        if (level > 1) {
            for (int countSpace = 1; countSpace <= level * space; countSpace++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * Сдвиг названий файлов/каталогов
     * на соответствующее количество пробелов
     * с учетом уровня вложенности
     */
    public static String addSpace(String rootPath, String fullPath, int space) {
        return countSpace(nestingLevel(rootPath, fullPath), space);
    }

    /**
     * Рекурсия
     */
    public static void recursive(String pathDirectory) throws IOException {
        Path path = Paths.get(pathDirectory);

        if (rootPath == null) {
            rootPath = path;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path file : stream) {
                if (!Files.isDirectory(file)) {
                    System.out.println(addSpace(rootPath.toString(), file.toString(), 4) + file.toString());
                } else {
                    recursive(file.toString());
                }
            }
        }
    }
}