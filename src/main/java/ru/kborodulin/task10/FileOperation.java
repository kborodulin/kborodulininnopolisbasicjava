package ru.kborodulin.task10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Работа с файлами
 */
public class FileOperation {
    public static String newFile(String pathFile, String nameFile) throws IOException {
        String pathFileName = pathFile + File.separator + nameFile;
        Path path = Paths.get(pathFileName);
        Files.createFile(path);
        return "Файл создан: " + pathFileName;
    }

    public static String renameFile(String pathFile, String oldNameFile, String newNameFile) throws IOException {
        String oldPathFileName = pathFile + File.separator + oldNameFile;
        String newPathFileName = pathFile + File.separator + newNameFile;
        Path oldPath = Paths.get(oldPathFileName);
        Path newPath = Paths.get(newPathFileName);
        Files.move(oldPath, newPath);
        return "Файл переименован: " + newPathFileName;
    }

    public static String copyFile(String pathFileName, String destinion) throws IOException {
        Path path = Paths.get(pathFileName);
        Path pathDestinion = Paths.get(destinion);
        Files.copy(path, pathDestinion);
        return "Файл скопирован: " + destinion;
    }

    public static String deleteFile(String pathFile, String nameFile) throws IOException {
        String pathFileName = pathFile + File.separator + nameFile;
        Path path = Paths.get(pathFileName);
        Files.delete(path);
        return "Файл удален: " + pathFileName;
    }
}