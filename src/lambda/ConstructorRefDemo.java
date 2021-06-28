package lambda;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass::new;
        MyClass myClass = myClassCons.func("Test");

        System.out.println("String string in mc: " + myClass.getString());
    }
}
