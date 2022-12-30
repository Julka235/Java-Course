package org.futurecollars.lesson6.notes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\julia\\Desktop\\data.txt");
        System.out.println(file.getName());
        System.out.println(file.canRead());
        System.out.println(file.exists());

        try {
            String text = Files.readString(Path.of("C:\\Users\\julia\\Desktop\\data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writeToFileNew("C:\\Users\\julia\\Desktop\\data.txt", "text");

    }

    // old version of writing to file
    public static void writeToFile(String pathToFile, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void writeToFileNew(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("I wrote text to file.");
        }
    }

    public static void parseTime(String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        try {
            simpleDateFormat.parse(time); // Alt + Enter
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            if(br != null) {
                br.close();
            }
        }
    }

    public static String readFirstLineNew(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }

    /*public static void parseTimeLogAndThrow(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
    }*/
}
