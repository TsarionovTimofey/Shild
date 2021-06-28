package Syntax;

public class Home5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        double sum = 0;
        double approx = 0;
        double[] doubles = new double[12];
        double[] doubles1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < 5; i++) {
            doubles[i] = i + 1;
            System.out.print(doubles[i] + " ");
        }
        System.out.println();
        for (double a : doubles1) {
            sum += a;
            if (a == (doubles1.length - 1))
                approx = sum / doubles1.length;
        }
        System.out.println(sum + " " + (doubles.length) + " " + approx);

        System.out.println("i like java".length());
        System.out.println("i like java".charAt(0));

        if (x < 0) y = 10;
        else y = 20;
    }
}
