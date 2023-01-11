package org.futurecollars.lesson6.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AmountOfCharacters {
    public static void main(String[] args) {
        String pathToFile = "data.txt";
        System.out.println(getAmountOfCharacters(pathToFile));
    }

    private static int getAmountOfCharacters(String pathToFile) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            return fileContent.length();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
