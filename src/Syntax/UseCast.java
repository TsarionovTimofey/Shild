package Syntax;

public class UseCast {
    public static void main(String[] args) {
int c;
        for (c = 0;c < 5; c++) {
            System.out.println(c + " / 3: " + c / 3);
            System.out.println(c + " / 3: with fractional path " + (double) c / 3);
            System.out.println();
            System.out.println("One\nTwo\nTree");
            for (int i = 2; i < 100; i++) {
                boolean numberIs = true;
                for (int g = 2; g < i; g++) {
                    if (i % g == 0) {
                        numberIs = false;
                        break;
                    }
                }
                if (numberIs) System.out.println(i);
            }
        }
    }
}
