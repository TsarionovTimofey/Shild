package wrap;

public class AutoBox2 {
    static void m(Integer integer) {
        System.out.println("m() get " + integer);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }

    public static void main(String[] args) {
        m(199);
        int i = m3();
        Integer integer = m2();
        System.out.println(Math.sqrt(integer));

    }
}
