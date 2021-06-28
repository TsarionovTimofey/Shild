package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {

        int i;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile - source and value");
            return;
        }
        try (FileInputStream fIn = new FileInputStream(args[0]);
             FileOutputStream fOut = new FileOutputStream(args[1])) {
            do {
                i = fIn.read();
                if (i != -1) fOut.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O exception " + e);
        }
    }
}
