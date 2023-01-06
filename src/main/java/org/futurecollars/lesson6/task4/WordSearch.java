package org.futurecollars.lesson6.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordSearch {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\julia\\Desktop\\data.txt";
        System.out.println(doesContainSearchedWord(pathToFile, "Java"));
        System.out.println(doesContainSearchedWord(pathToFile, "Coffee"));
    }

    public static boolean doesContainSearchedWord(String pathToFile, String searchedWord) {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            return fileContent.contains(searchedWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
