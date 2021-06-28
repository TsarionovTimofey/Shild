package Syntax;

public class ParamsDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();
        if (e.isEven(10)) System.out.println("10 - odd number");
        if (e.isEven(9)) System.out.println("9 - odd number");
        if (e.isEven(8)) System.out.println("8 - odd number");
    }
}
