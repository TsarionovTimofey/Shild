package exceptions;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("After catch");
    }
}
