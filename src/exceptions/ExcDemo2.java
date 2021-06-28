package exceptions;

public class ExcDemo2 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            ExcTest.genException();
            System.out.println("After generation exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array range");
            System.out.println(e.toString());
        }
        System.out.println("After instruction catch");
    }
}
