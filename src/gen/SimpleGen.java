package gen;

public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Gen");
        twoGen.showTypes();
        System.out.println("values = " + twoGen.getObject1() + " " +
                twoGen.getObject2());
    }
}
