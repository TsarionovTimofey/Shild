package gen;

public class WildcardDemo {
    public static void main(String[] args) {
        NumericFns<Integer> integerNumericFns = new NumericFns<>(6);
        NumericFns<Double> doubleNumericFns = new NumericFns<>(-6.0);
        NumericFns<Long> longNumericFns = new NumericFns<>(5L);

        System.out.println("comparison of values integerNumericFns and " +
                "doubleNumericFns");
        if (integerNumericFns.absEqual(doubleNumericFns)) {
            System.out.println("absolute values are the same");
        } else System.out.println("absolute values are the are different");
    }
}
