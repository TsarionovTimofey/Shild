package Syntax;

public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Value val: " + StaticMeth.val);
        System.out.println("Syntax.StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("Value val: " + StaticMeth.val);
        System.out.println("Syntax.StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
