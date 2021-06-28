package lambda;

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum = new MyIntNum(12);
        MyIntNum myIntNum2 = new MyIntNum(16);

        IntPredicate intPredicate = myIntNum::isFactor;

        result = intPredicate.test(3);
        if (result) System.out.println("3 isFactor " + myIntNum.getV());

        intPredicate = myIntNum2::isFactor;
        result = intPredicate.test(3);
        if (!result) System.out.println("3 is not factor " + myIntNum2.getV());
    }
}
