package com.jareer.abstractexample_02.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport {

    public String parse(String path) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext()) {
            scanner.nextLine();
        } else return "Empty file";

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);

            boolean matches = matcher.matches();
            if (matches)
                out += nextLine + "\n";
        }
        return out.isBlank() ? "Empty file" : out;

    }

    public void prepareAndSendreport(String path)
            throws FileNotFoundException {

        System.out.println("Start report");
        System.out.println(parse(path));
        System.out.println("sent report");
    }

}
