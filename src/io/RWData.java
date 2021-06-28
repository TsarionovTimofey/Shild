package io;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try(DataOutputStream dataOutputStream =
                    new DataOutputStream(
                            new FileOutputStream("testdata"))) {

            System.out.println("Recorded: " + i);
            dataOutputStream.writeInt(i);

            System.out.println("Recorded: " + d);
            dataOutputStream.writeDouble(d);

            System.out.println("Recorded: " + b);
            dataOutputStream.writeBoolean(b);

            System.out.println("Recorded: " + 12.2 * 7.4);
            dataOutputStream.writeDouble(12.2*7.4);

        } catch (IOException e) {
            System.out.println(e);
            return;
        }
        System.out.println();
        try (DataInputStream dataInputStream =
                     new DataInputStream(
                             new FileInputStream("testdata"))) {
            i = dataInputStream.readInt();
            System.out.println("read it: " + i);

            d = dataInputStream.readDouble();
            System.out.println("read it: " + d);

            b = dataInputStream.readBoolean();
            System.out.println("read it: " + b);

            d = dataInputStream.readDouble();
            System.out.println("read it: " + 12.2 * 7.4);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
