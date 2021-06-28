package Syntax;

public class HomeSymbols2 {
    public static void main(String[] args) throws java.io.IOException {
        char symbol;
        int counter = 0;
        for (; ; ) {
            symbol = (char) System.in.read();
            if (symbol >= 'a' && symbol <= 'z') {
                symbol -= 32;
                System.out.print(symbol);
                counter++;
            } else if (symbol >= 'A' && symbol <= 'Z') {
                symbol += 32;
                System.out.print(symbol);
                counter++;
            } else if (symbol == '.') {
                System.out.println(counter);
                break;
            } else {
                System.out.print(symbol);
            }
        }
    }
}
