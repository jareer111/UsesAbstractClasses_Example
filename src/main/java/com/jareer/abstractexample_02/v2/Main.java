package com.jareer.abstractexample_02.v2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(" This is second  approach ");

            new NumberExtractorReport().prepareAndSendreport("src/baza.txt");
            System.out.print("________________________________________________________");
            new EmailExtractorReport().prepareAndSendreport("src/baza.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
