package Syntax;

public class LogicalOpTableHome {
    public static void main(String[] args) {
        boolean p, q;
        String output;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        output = (p + "\t" + "\t" + q + "\t" + "\t"
                + (p & q) + "\t" + "\t" + (p | q) + "\t" + "\t"
                + (p ^ q) + "\t" + "\t" + (!p));
        output = output.replaceAll("true", "1")
                .replaceAll("false", "0");
        System.out.println(output);

        System.out.print((p ? 1 : 0) + "\t" + "\t" + (q ? 1 : 0) + "\t" + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + "\t" + ((p | q) ? 1 : 0) + "\t" + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + "\t" + ((!p) ? 1 : 0));

        if (p) {
            System.out.print("1" + "\t" + "\t");
        } else {
            System.out.print("0" + "\t" + "\t");
        } ;
        if (q) {
            System.out.print("1" + "\t" + "\t");
        } else {
            System.out.print("0" + "\t" + "\t");
        } ;
        if (p & q) {
            System.out.print("1" + "\t" + "\t");
        } else {
            System.out.print("0" + "\t" + "\t");
        } ;
        if (p | q) {
            System.out.print("1" + "\t" + "\t");
        } else {
            System.out.print("0" + "\t" + "\t");
        } ;
        if (p ^ q) {
            System.out.print("1" + "\t" + "\t");
        } else {
            System.out.print("0" + "\t" + "\t");
        } ;
        if (!p) {
            System.out.print("1" + "\t" + "\t"+ "\n");
        } else {
            System.out.print("0" + "\t" + "\t"+ "\n");
        } ;

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
