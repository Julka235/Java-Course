package org.futurecollars.lesson6.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EverySecondLineDisplay {
    public static void main(String[] args) {
        printEverySecondLine("C:\\Users\\MyName\\data.txt");
    }

    public static void printEverySecondLine(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            String[] lines = fileContent.split("\n");
            for(int i=0; i < 7; i+=2) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
