package lambda;

public class MyIntNum {
    private int v;

    public MyIntNum(int v) {
        this.v = v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    public int getV() {
        return v;
    }
}
