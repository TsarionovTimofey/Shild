package wrap;

public class Wrap {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        int i = integer.intValue();
        System.out.println();

        System.out.println(i + " " + integer);

        Integer integer1 = 100;
        int i1 = integer1;

        System.out.println(i1 + " " + integer1);
    }
}
