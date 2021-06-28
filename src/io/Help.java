package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpFileName;

    Help(String helpFileName) {
        this.helpFileName = helpFileName;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(helpFileName))) {
            do {
                ch = bufferedReader.read();
                if (ch == '#') {
                    topic = bufferedReader.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = bufferedReader.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Choose theme:");
        try {
            topic = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return topic;
    }
}
