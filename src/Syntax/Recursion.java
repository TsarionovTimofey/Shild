package Syntax;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("recursive calculation");
        System.out.println("Syntax.Factorial 3 is equal: " + f.factR(3));
        System.out.println("Syntax.Factorial 4 is equal: " + f.factR(4));
        System.out.println("Syntax.Factorial 5 is equal: " + f.factR(5));
        System.out.println("iterative calculation");
        System.out.println("Syntax.Factorial 3 is equal: " + f.factI(3));
        System.out.println("Syntax.Factorial 4 is equal: " + f.factI(4));
        System.out.println("Syntax.Factorial 5 is equal: " + f.factI(5));
    }
}
