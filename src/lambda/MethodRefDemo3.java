package lambda;

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum = new MyIntNum(12);
        MyIntNum myIntNum2 = new MyIntNum(16);

        MyIntNumPredicate myIntNumPredicate = MyIntNum::isFactor;

        result = myIntNumPredicate.test(myIntNum, 3);
        if (result) System.out.println("3 isFactor " + myIntNum.getV());
    }
}
