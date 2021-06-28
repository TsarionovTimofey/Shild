package Syntax;

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        System.out.println("Enter eny key, and push the ENTER: ");
        ch = (char) System.in.read();
        System.out.println("You entered the key: " + ch);
    }
}
