package com.jareer.abstractexample_02.v1;

import java.io.FileNotFoundException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        try {
            String path = String.valueOf(Path.of("src/baza.txt"));
            System.out.println(" This is first  approach ");
            new NumberExtractorReport().prepareAndSendreport(path);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
