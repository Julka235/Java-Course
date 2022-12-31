package org.futurecollars.lesson4.task4;

public class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
