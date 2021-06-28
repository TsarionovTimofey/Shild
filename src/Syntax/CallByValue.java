package Syntax;

public class CallByValue {
    public static void main(String[] args) {
        Test obj = new Test(15,20);
        int a = 15, b = 20;

        System.out.println("a and b before the call: " + a + " " + b);
        obj.noChange(a, b);
        System.out.println("a and b after the call: " + a + " " + b);
    }
}
