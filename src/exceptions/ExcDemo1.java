package exceptions;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Before generation exception");
            nums[7] = 10;
            System.out.println("After generation exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array range");
            System.out.println(e.toString());
        }
        System.out.println("After instruction catch");
    }
}
