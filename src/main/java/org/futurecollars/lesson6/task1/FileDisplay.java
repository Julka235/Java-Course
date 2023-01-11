package org.futurecollars.lesson6.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDisplay {
    public static void main(String[] args) {
        String pathToFile = "data.txt"
        printFile(pathToFile);
    }

    private static void printFile(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            System.out.println(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
