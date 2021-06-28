package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        String string;
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbols; End symbol is .");
        do {
            string = bufferedReader.readLine();
            System.out.println(string);
        } while (!string.equals("stop"));
    }
}