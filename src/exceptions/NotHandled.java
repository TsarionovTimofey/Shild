package exceptions;

public class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];
        System.out.println("Before generation exception");
        nums[7] = 10;
    }
}
