package lambda;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
//            num++;
            return v;
        };
        System.out.println(myLambda.func(8));
//        num = 9;
    }
}
