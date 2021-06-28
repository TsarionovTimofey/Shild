package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String string;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.println("How many numbers to enter");
        string = bufferedReader.readLine();
        try {
            n = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
            n = 0;
        }

        System.out.println("Entered " + n + " values");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            string = bufferedReader.readLine();
            try {
                t = Double.parseDouble(string);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
                t = 0.0;
            }
            sum += t;
            avg = sum / n;
            System.out.println("Average value: " + avg);
        }
    }
}
