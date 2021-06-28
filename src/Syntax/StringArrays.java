package Syntax;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "string", "is", "text"};
        System.out.println("Source array: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[2] = "also are";
        strs[3] = "text";

        System.out.println("Modified array: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
