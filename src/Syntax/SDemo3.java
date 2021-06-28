package Syntax;

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock("Inside constructor");
        System.out.println("square root of 2 is equal to " + StaticBlock.rootOf2);
        System.out.println("square root of 3 is equal to " + StaticBlock.rootOf3);
    }
}
