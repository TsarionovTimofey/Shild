package Syntax;

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("Syntax.Interfaces.A letter from the range a-z is conceived");
            System.out.println("Try to guess it");
            ch = (char) System.in.read();
            System.out.println("read");
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("Right!!!");
            else {
                System.out.println("Sorry, the desired letter is");
                if (ch < answer) System.out.println("Near the end of the alphabet");
                else System.out.println("Near the start of the alphabet");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
