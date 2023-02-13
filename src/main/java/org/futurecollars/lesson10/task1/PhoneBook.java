package org.futurecollars.lesson10.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static final int AMOUNT_OF_PERSONAL_ELEMENTS_WITHOUT_PHONE_NUMBER = 2;
    private static final int AMOUNT_OF_PERSONAL_ELEMENTS_WITH_PHONE_NUMBER = 3;
    private final Map<String, Person> persons;
    private final String pathToFile;

    public PhoneBook(String pathToFile) {
        this.persons = new HashMap<>();
        this.pathToFile = pathToFile;
        readFile();
    }

    private void readFile() {
        try {
            String fileContent = Files.readString(Path.of(pathToFile));
            String[] personsData = fileContent.split("\n");
            for (String personsDatum : personsData) {
                String[] personData = personsDatum.split(";");
                if (personData.length == AMOUNT_OF_PERSONAL_ELEMENTS_WITHOUT_PHONE_NUMBER) {
                    persons.put(personData[0], new Person(personData[0], personData[1]));
                }
                else if (personData.length == AMOUNT_OF_PERSONAL_ELEMENTS_WITH_PHONE_NUMBER) {
                    persons.put(personData[0], new Person(personData[0], personData[1], personData[2]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Person person) {
        this.persons.put(person.getName(), person);
        writeToFile(person);
    }

    private void writeToFile(Person person) {
        String text = person.getName() + ';' + person.getAddress();
        if (person.getPhoneNumber() != null) {
            text += ';' + person.getPhoneNumber();
        }
        text += '\n';

        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(new File(pathToFile), true);
            bw = new BufferedWriter(fw);
            bw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Person get(String name) {
        if (this.persons.containsKey(name)) {
            return this.persons.get(name);
        }
        throw new RuntimeException("This phone book does not contain this person: " + name);
    }
}