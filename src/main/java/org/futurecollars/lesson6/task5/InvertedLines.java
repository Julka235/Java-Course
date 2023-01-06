package org.futurecollars.lesson6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InvertedLines {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\MyName\\data.txt";
        invertLines(pathToFile);
    }

    public static void invertLines(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            String[] lines = fileContent.split("\n");
            for(int i = lines.length - 1; i >= 0; --i) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
