package io;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args)
            throws IOException {
        byte data[] = new byte[10];

        System.out.println("Enter the symbols");
        System.in.read(data);
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) if (data[i] != 0) System.out.print((char) data[i]);
    }
}
