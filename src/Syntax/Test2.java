package Syntax;

public class Test2 {
    private int a;

    Test2(int i) {
        a = i;
    }

    void swap(Test2 obj, Test2 obj2) {
        int a = obj.getA();
        obj.setA(obj2.getA());
        obj2.setA(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test2 obj1 = new Test2(85);
        Test2 obj2 = new Test2(100);
        System.out.println(obj1.getA() + " " + obj2.getA());
        obj1.swap(obj1, obj2);
        System.out.println(obj1.getA() + " " + obj2.getA());
    }
}
