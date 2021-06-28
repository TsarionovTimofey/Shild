package Syntax;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoObj = new ByTwos();
        ByThrees threeObj = new ByThrees();
        Series obj;

        for (int i = 0; i < 5; i++) {
            obj = twoObj;
            System.out.println("Next value Syntax.ByTwos: " + obj.getNext());
            obj = threeObj;
            System.out.println("Next value Syntax.ByTwos: " + obj.getNext());
        }
    }
}
