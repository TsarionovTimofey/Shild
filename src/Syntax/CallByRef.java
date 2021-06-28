package Syntax;

public class CallByRef {
    public static void main(String[] args) {
        Test obj = new Test(15, 20);

        System.out.println("obj.a and obj.b before the call: " + obj.a + " " + obj.b);
        obj.change(obj);
        System.out.println("a and b after the call: " + obj.a + " " + obj.b);
    }
}
