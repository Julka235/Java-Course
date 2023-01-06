package org.futurecollars.lesson6.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UpperCaseFormatter {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\MyName\\output.txt";
        String text = getUpperCase("C:\\Users\\MyName\\Desktop\\data.txt");
        createFile(pathToFile);
        writeToFile(pathToFile, text);
    }

    public static String getUpperCase(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            return fileContent.toUpperCase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile(String pathToFile) {
        File file = new File(pathToFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Path.of(pathToFile), text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
