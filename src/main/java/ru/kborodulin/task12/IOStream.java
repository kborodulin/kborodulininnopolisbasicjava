package ru.kborodulin.task12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOStream {
    public static void addLineFile(String fileName, String charset, List<String> list) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName), Charset.forName(charset))) {
            for (String line : list) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public static List<String> readLineFile(String fileName, String charset) throws IOException {
        List<String> lineList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), Charset.forName(charset))) {
            while (reader.ready()) {
                lineList.add(reader.readLine());
            }
        }
        return lineList;
    }
}