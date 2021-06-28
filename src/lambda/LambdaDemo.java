package lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myValue;
        myValue = () -> 98.6;
        System.out.println(myValue.getValue());

        MyParamValue myParamValue = (n) -> 1.0 / n;

        System.out.println(myParamValue.getValue(4));
        System.out.println(myParamValue.getValue(8));

//        myValue = () -> "three";
//        myParamValue = () -> Math.random();

    }
}
