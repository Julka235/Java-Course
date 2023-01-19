package org.futurecollars.lesson5.task1;

public class TextUtils {
    public static boolean isPalindrome(String text) {
        if(text == null || text.equals("")) return false;
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int forward = 0;
        int backward = cleanText.length() - 1;
        while (backward > forward) {
            char forwardChar = cleanText.charAt(forward++);
            char backwardChar = cleanText.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static int getTextLength(String text) {
        if(text == null) return -1;
        if(text.equals("")) return 0;
        return text.length();
    }
}
