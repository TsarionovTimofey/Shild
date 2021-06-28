package exceptions;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Before generation exception");
            ExcTest.genException();
            System.out.println("After generation exception");
        } catch (ArithmeticException e) {
            System.out.println("Out of array range");
            System.out.println(e.toString());
        }
        System.out.println("After instruction catch");
    }
}
