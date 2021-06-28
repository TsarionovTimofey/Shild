package lambda;

public class MyClass {
    static <T> boolean myGenMeth(T x, T y) {
        return false;
    }

    private String string;

    public MyClass(String string) {
        this.string = string;
    }

    MyClass() {
        string = "";
    }

    public String getString() {
        return string;
    }

    public static void main(String[] args) {
        SomeTest<Integer> integerSomeTest = MyClass::<Integer>myGenMeth;

        MyClassArrayCreator myClassArrayCreator = MyClass[]::new;
        MyClass[] a = myClassArrayCreator.func(3);
        for (int i = 0; i < 3; i++) a[i] = new MyClass(Integer.toString(i));

        MyArrayCreator<Thread> myArrayCreator = Thread[]::new;
        Thread[] threads = myArrayCreator.func(5);
    }
}
