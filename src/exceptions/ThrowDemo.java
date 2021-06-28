package exceptions;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before instruction throw");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        System.out.println("After");
    }
}
