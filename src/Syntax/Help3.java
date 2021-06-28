package Syntax;

public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        for (; ; ) {
            do {
                System.out.println("Reference:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.println("Choose (q = exit): ");

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');
            if (choice == 'q') break;
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
                case '3':
                    System.out.println("Cycle for:\n");
                    System.out.print("for (initialization; condition; iteration)");
                    System.out.println(" instruction;");
                    break;
                case '4':
                    System.out.println("Cycle while:\n");
                    System.out.println("while(condition) instruction;");
                    break;
                case '5':
                    System.out.println("Cycle do-while:\n");
                    System.out.println("do {");
                    System.out.println(" instruction;");
                    System.out.println("} while (condition);");
                    break;
                case 6:
                    System.out.println("Instruction break:\n");
                    System.out.println("break; or break mark");
                    break;
                case 7:
                    System.out.println("Instruction continue:\n");
                    System.out.println("continue; or continue mark");
            }
        }
    }
}