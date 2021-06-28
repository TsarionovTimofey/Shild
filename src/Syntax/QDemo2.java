package Syntax;

public class QDemo2 {
    public static void main(String[] args) {
        char ch;
        int i;
        Queue q1 = new Queue(10, "char");
        char[] name = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));
        Queue q3 = new Queue(q1);

        System.out.print("q1 Content: ");
        for (i = 0; i < 10; i++) {
            ch = q1.getChar();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("q2 Content: ");
        for (i = 0; i < 3; i++) {
            ch = q2.getChar();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("q3 Content: ");
        for (i = 0; i < 10; i++) {
            ch = q3.getChar();
            System.out.print(ch);
        }
    }
}