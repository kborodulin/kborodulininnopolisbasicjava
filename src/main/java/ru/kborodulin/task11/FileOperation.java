package ru.kborodulin.task11;

import lombok.Getter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperation {
    @Getter
    private static String fileName;

    public static void newFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            FileOperation.fileName = fileName;
        } else {
            Files.createFile(path);
            FileOperation.fileName = fileName;
        }
    }
}