package Syntax;

public class DWDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        do {
            System.out.println("Press the desired key and then Enter: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
