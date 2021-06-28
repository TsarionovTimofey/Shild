package Syntax;

public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x=0; x<6; x++) {
            if (x==1)
                System.out.println("x equals 1");
            else if (x==2)
                System.out.println("x equals 2");
            else if (x==3)
                System.out.println("x equals 3");
            else if (x==4)
                System.out.println("x equals 4");
            else
                System.out.println("x value is out of range 1-4");
        }
    }
}
