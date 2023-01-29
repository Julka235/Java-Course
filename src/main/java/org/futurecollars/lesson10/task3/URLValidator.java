package org.futurecollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {
    public static boolean isValid(String url) {
        return isHttpValid(url) && isDomainValid(url);
    }

    private static boolean isHttpValid(String url) {
        Pattern httpPattern = Pattern.compile("^http://");
        Matcher httpMatcher = httpPattern.matcher(url);

        Pattern httpsPattern = Pattern.compile("^https://");
        Matcher httpsMatcher = httpsPattern.matcher(url);

        return httpMatcher.find() || httpsMatcher.find();
    }

    private static boolean isDomainValid(String url) {
        Pattern plPattern = Pattern.compile(".pl$");
        Matcher plMatcher = plPattern.matcher(url);

        Pattern comPattern = Pattern.compile(".com$");
        Matcher comMatcher = comPattern.matcher(url);

        return plMatcher.find() || comMatcher.find();
    }
}
