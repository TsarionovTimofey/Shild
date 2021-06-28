package Syntax;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100, "char");
        Queue smallQ = new Queue(4, "char");
        Queue intQ = new Queue(8, "int");
        char ch;
        int number;
        int i;
        System.out.println("Using the queue bigQ for saving the alphabet");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.print("Syntax.Queue bigQ content: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.getChar();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");
        System.out.println("Using queue smallQ for generate errors");
        for (i = 0; i < 5; i++) {
            System.out.print("Attempt to save " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Syntax.Queue smallQ content: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.getChar();
            if (ch != (char) 0) System.out.print(ch);
        }

        for (i = 0; i < 13; i++)
            intQ.put(i * 22);
        System.out.print("Syntax.Queue intQ content: ");
        for (i = 0; i < 13; i++) {
            number = intQ.getInt();
            System.out.print(number + " ");
        }
    }
}
