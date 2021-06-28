package gen;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        MyClass<Integer> integerMyClass = new MyClass<>(x);

        if (integerMyClass.contains(2)) System.out.println("integerMyClass contain " +
                "2");
        else System.out.println("integerMyClass not contain " +
                "2");

        if (integerMyClass.contains(5)) System.out.println("integerMyClass contain " +
                "5");
        else System.out.println("integerMyClass not contain " +
                "5");
    }
}
