package exceptions;

public class ThrowsDemo {
    public static char prpmpt(String string)
            throws java.io.IOException {
        System.out.println(string + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prpmpt("enter a letter");
        } catch (java.io.IOException e) {
            System.out.println(e);
            ch = 'X';
        }
        System.out.println("You entered " + ch);
    }
}
