package gen;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> numericFns = new NumericFns<>(5);
        System.out.println("reverse value numericFns - " +
                numericFns.reciprocal());
        System.out.println("fractional part numericFns - " +
                numericFns.fraction());
        System.out.println();

        NumericFns<Double> numericFns1 = new NumericFns<>(5.25);
        System.out.println("reverse value numericFns1 - " +
                numericFns1.reciprocal());
        System.out.println("fractional part numericFns1 - " +
                numericFns1.fraction());
        System.out.println();
//        NumericFns<String> numericFns2 = new NumericFns<>(5);

        NumericFns<Double> doubleNumericFns = new NumericFns<>(1.25);
        NumericFns<Float> floatNumericFns = new NumericFns<>(-1.25f);

        if (doubleNumericFns.absEqual(floatNumericFns)) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
