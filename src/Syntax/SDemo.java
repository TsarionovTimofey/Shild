package Syntax;

public class SDemo {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        obj1.x = 10;
        obj2.x = 20;
        System.out.println("Of course, obj1.x and obj2.x " + "are independent");
        System.out.println("obj1.x " + obj1.x + "\nobj2.x: " + obj2.x);
        System.out.println("Static variable y - general");
        StaticDemo.y = 19;
        System.out.println("Assign Syntax.StaticDemo.y value of 19");
        System.out.println("obj1.sum(): " + obj1.sum());
        System.out.println("obj2.sum(): " + obj2.sum());
        System.out.println();
        StaticDemo.y = 100;
        System.out.println("Change the Syntax.StaticDemo.y value to 100");
        System.out.println("obj1.sum(): " + obj1.sum());
        System.out.println("obj2.sum(): " + obj2.sum());
        System.out.println();
    }
}
