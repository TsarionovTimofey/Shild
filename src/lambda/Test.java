package lambda;

public class Test {
    public static void main(String[] args) {
        MyTransform<Double> sqrts = (v) -> {
            for (int i = 0; i < v.length; i++) v[i] = Math.sqrt(v[i]);
        };
    }
}
