package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fIn = null;
        FileOutputStream fOut = null;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile - source and value");
            return;
        }
        try {
            fIn = new FileInputStream(args[0]);
            fOut = new FileOutputStream(args[1]);

            do {
                i = fIn.read();
                if (i != -1) fOut.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O exception");
        } finally {
            try {
                if (fIn != null) fIn.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            try {
                if (fOut != null) fOut.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
