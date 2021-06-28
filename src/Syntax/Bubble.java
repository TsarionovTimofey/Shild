package Syntax;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        System.out.println("Source array:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(" " + numbers[i]);
        System.out.println();

        for (a = 1; a < numbers.length; a++)
            for (b = numbers.length - 1; b >= a; b--) {
                if (numbers[b - 1] > numbers[b]) {
                    t = numbers[b - 1];
                    numbers[b - 1] = numbers[b];
                    numbers[b] = t;
                }
            }
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(" " + numbers[i]);
        System.out.println();
    }
}
