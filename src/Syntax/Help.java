package Syntax;

public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        System.out.println("Reference:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Choose: ");

        choice = (char) System.in.read();
        switch (choice) {
            case '1':
                System.out.println("Instruction if:\n");
                System.out.println("if(condition) instruction;");
                System.out.println("else instruction");
                break;
            case '2':
                System.out.println("Instruction switch:\n");
                System.out.println("switch(expression {");
                System.out.println(" case constant:");
                System.out.println(" sequence of instructions");
                System.out.println(" break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Request not found");
        }
    }
}
