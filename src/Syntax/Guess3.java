package Syntax;

public class Guess3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("The value of the letter in the range a-z");
        System.out.print("Try to guess her: ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("Right!!!");
        else {
            System.out.println("Sorry, the desired letter is");
            if (ch<answer) System.out.println("Near the end of the alphabet");
            else System.out.println("Near the start of the alphabet");
        }
    }
}

