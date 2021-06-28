package Syntax;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        HelpForHelpClassDemo help = new HelpForHelpClassDemo();
        for (; ; ) {
            do {
                help.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(choice));
            if (choice == 'q') break;
            System.out.println();
            help.helpOn(choice);
        }
    }
}
