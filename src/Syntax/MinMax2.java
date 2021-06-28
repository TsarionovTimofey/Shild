package Syntax;

public class MinMax2 {
    public static void main(String[] args) {
        int[] numbers = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = numbers[0];
        for (int i = 1; i < 10; i++) {
                if (numbers[i] < min) min = numbers[i];
                if (numbers[i] > max) max = numbers[i];
            }
            System.out.println("min and max:" + min + " " + max);
        }
    }
