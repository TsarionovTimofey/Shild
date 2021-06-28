package Syntax;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Passed to the program: " + args.length +
                " command line arguments");
        System.out.println("List of arguments ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
