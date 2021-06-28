package Syntax;

public class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("For stop will press the key S");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Step #" + i);
    }
}
