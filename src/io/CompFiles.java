package io;

import java.io.FileInputStream;

import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;
        if (args.length != 2) {
            System.out.println("Usage: CompFiles file1 file2");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j) System.out.println("Content file1 and file 2 are different");
            else System.out.println("Content file1 and file 2 matches");
        } catch (IOException e) {
            System.out.println("I/O exception " + e);
        }
    }
}
