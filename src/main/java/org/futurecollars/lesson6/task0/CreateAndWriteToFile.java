package org.futurecollars.lesson6.task0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateAndWriteToFile {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\MyName\\data.txt";
        createFile(pathToFile);
        writeToFile(pathToFile, "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku");
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
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("I wrote text to file.");
        }
    }
}
