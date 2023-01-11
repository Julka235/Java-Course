package org.futurecollars.lesson7.notes;

public class Sample {
    public static boolean isPalindrome(String text) {
        if(text == null || text == "") return false;
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static boolean isHospitalizationNeeded(TreatmentType treatmentType) {
        if(treatmentType == TreatmentType.SURGICAL || treatmentType == TreatmentType.PALLIATIVE) return true;
        else return false;
    }

}
