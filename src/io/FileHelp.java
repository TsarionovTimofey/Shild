package io;

public class FileHelp {
    public static void main(String[] args) {
        Help hlpObj = new Help("help.txt");
        String topic;

        System.out.println("Use help system!\n" + "For exit enter" +
                "string stop + key enter");
        do {
            topic = hlpObj.getSelection();
            if (!hlpObj.helpOn(topic) && topic.compareTo("stop") != 0) System.out.println("Theme not found");
        } while (topic.compareTo("stop") != 0);
    }
}
