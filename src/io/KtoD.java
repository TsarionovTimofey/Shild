package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) {
        String string;
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" indicates the end of the input string: stop");

        try (FileWriter fileWriter =
                     new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                string = bufferedReader.readLine();
                if (string.compareTo("stop") == 0) break;
                string += "\r\n";
                fileWriter.write(string);
            } while (string.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("I/O exception: " + e);
        }
    }
}
