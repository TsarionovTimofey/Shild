package lambda;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10,2)) System.out.println("2 isFactor 10");
        System.out.println();

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0,4.0)) System.out.println("4.0 isFactor 212.0");
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.contains(b);
        String string = "Functional generated interface";

        if (isIn.test(string,"face")) System.out.println("found!");
        else System.out.println("Not found");
    }
}
