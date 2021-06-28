package lambda;

public class MethodRefDemo {
    static boolean numTest (IntPredicate intPredicate, int v) {
        return intPredicate.test(v);
    }

    public static void main(String[] args) {
        boolean result;
        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 - isPrime");

        result = numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 - isEven");

        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 - isPositive");

    }
}
