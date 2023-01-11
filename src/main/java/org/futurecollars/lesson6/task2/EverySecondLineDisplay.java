package org.futurecollars.lesson6.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EverySecondLineDisplay {
    public static void main(String[] args) {
        String pathToFile = "data.txt";
        printEverySecondLine(pathToFile);
    }

    private static void printEverySecondLine(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            String[] lines = fileContent.split("\n");
            for(int i = 0; i < lines.length; i += 2) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
