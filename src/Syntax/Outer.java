package Syntax;

public class Outer {
    int[] nums;

    Outer(int n[]) {
        nums = n;
    }

    void Analyze() {
        Inner inObj = new Inner();
        System.out.println("Min: " + inObj.min());
        System.out.println("Max: " + inObj.max());
        System.out.println("Avg: " + inObj.avg());
    }

    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            for (int num : nums) a += num;
            return a / nums.length;
        }
    }
}
