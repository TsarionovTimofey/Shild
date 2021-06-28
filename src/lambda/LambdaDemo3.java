package lambda;

public class LambdaDemo3 {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.contains(b);
        String string = "Is Test";

        if (isIn.test(string, "Is")) System.out.println("found");
        else System.out.println("not found");

        if (isIn.test(string, "xyz")) System.out.println("found");
        else System.out.println("not found");
    }
}
