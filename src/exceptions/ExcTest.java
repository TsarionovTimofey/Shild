package exceptions;

public class ExcTest {
    static void genException() {
        int[] nums = new int[4];
        System.out.println("Before generation exception");
        nums[7] = 10;
    }
}
