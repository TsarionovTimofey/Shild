package Syntax;

public class Test3 {
    public static void main(String[] args) {
        String string = "Vsem privet!";
        char end = string.charAt((string.length() - 1));
        char start = string.charAt(0);
        System.out.println(iterative(string));
        System.out.println(recursive(string));
        System.out.println(string.substring(1) + string.charAt(0));
        System.out.println(sum(2, 4, 5, 6));
    }

    static String iterative(String string) {
        String result = "";
        for (int i = string.length() - 1, j = 1; i >= 0; i--, j++) {
            result += string.charAt((string.length() - j));
        }
        return result;
    }

    static String recursive(String string) {
        if (string.length() <= 1) return string;
        return recursive(string.substring(1)) + string.charAt(0);
    }

    static int sum(int... nums) {
        int sum = 0;
        System.out.println(nums.length);
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) sum += nums[i];
            return sum;
        } else return 0;
    }
}