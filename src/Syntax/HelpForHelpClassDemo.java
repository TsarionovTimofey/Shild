package Syntax;

public class HelpForHelpClassDemo {

    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("Instruction if:");
                System.out.println("if(condition) instruction;");
                System.out.println("else instruction");
                break;
            case '2':
                System.out.println("Instruction switch:");
                System.out.println("switch(expression {");
                System.out.println(" case constant:");
                System.out.println(" sequence of instructions");
                System.out.println(" break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Cycle for:");
                System.out.print("for (initialization; condition; iteration)");
                System.out.println(" instruction;");
                break;
            case '4':
                System.out.println("Cycle while:");
                System.out.println("while(condition) instruction;");
                break;
            case '5':
                System.out.println("Cycle do-while:");
                System.out.println("do {");
                System.out.println(" instruction;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("Instruction break:");
                System.out.println("break; or break mark");
                break;
            case '7':
                System.out.println("Instruction continue:");
                System.out.println("continue; or continue mark");
                break;
        }
        System.out.println();
    }

    void showMenu () {
        System.out.println("Reference:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue");
        System.out.println("Choose (q = exit): ");
    }

    boolean isValid (int ch) {
        if ((ch < '1' | ch > '7' & ch != 'q')) return false;
        else return true;
    }
}
