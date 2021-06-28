package gen;

public class NumericFns<T extends Number> {
    T num;

    public NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns<?> numericFns) {
        if (Math.abs(num.doubleValue()) ==
                Math.abs(numericFns.num.doubleValue())) return true;
        return false;
    }
}
