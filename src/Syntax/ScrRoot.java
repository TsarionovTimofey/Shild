package Syntax;

public class ScrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of the " + num + " is equal to " + sroot);
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error: " +rerr);
            System.out.println();
        }
    }
}
