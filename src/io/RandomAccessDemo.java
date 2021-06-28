package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                randomAccessFile.writeDouble(data[i]);
            }
            randomAccessFile.seek(0);
            d = randomAccessFile.readDouble();
            System.out.println("First value: " + d);

            randomAccessFile.seek(8);
            d = randomAccessFile.readDouble();
            System.out.println("Second value: " + d);

            randomAccessFile.seek(8 * 3);
            d = randomAccessFile.readDouble();
            System.out.println("Second value: " + d);

            System.out.println();

            System.out.println("reading even values through one");
            for (int i = 0; i < data.length; i += 2) {
                randomAccessFile.seek(8 * i);
                d = randomAccessFile.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException e) {
            System.out.println("I/O exception: " + e);
        }
    }
}
