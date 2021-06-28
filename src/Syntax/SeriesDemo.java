package Syntax;

public class SeriesDemo {
    public static void main(String[] args) {

        ByTwos obj = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obj.getNext());

        System.out.println("Reset");
        obj.reset();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obj.getNext());

        System.out.println("Start value: 100");
        obj.setStart(100);

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obj.getNext());
    }
}
