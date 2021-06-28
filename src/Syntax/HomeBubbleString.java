package Syntax;

public class HomeBubbleString {
    public static void main(String[] args) {
        String[] strings = {"Taganrog", "Rostov","Astrahan", "Saratov", "Moscow", "London"};
        int a, b;
        String t;
        System.out.println("Source array:");
        for (int i = 0; i < strings.length; i++)
            System.out.print(" " + strings[i]);
        System.out.println();

        for (a = 1; a < strings.length; a++)
            for (b = strings.length - 1; b >= a; b--) {
                if (strings[b - 1].charAt(0) > strings[b].charAt(0)) {
                    t = strings[b - 1];
                    strings[b - 1] = strings[b];
                    strings[b] = t;
                }
            }
        System.out.println("Sorted array:");
        for (int i = 0; i < strings.length; i++)
            System.out.print(" " + strings[i]);
        System.out.println();
    }
}