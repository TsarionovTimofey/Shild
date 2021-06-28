package Syntax;

public class HomeSymbols {
    public static void main(String[] args) throws java.io.IOException {
        int count = 0;
        char symbol;
        for (; ; ) {
            symbol = (char) System.in.read();
            if (symbol == ' ') count++;
            if (symbol == '.') {
                System.out.println(count);
                break;
            }
        }
    }
}
