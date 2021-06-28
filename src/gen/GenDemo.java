package gen;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen;
        integerGen = new Gen<>(88);
        integerGen.showType();
        int v = integerGen.getObj();
        System.out.println("value: " + v);
        System.out.println();
        Gen<String> stringGen = new Gen<>("Test generic");
        stringGen.showType();
        System.out.println("value: " + stringGen.getObj());
    }
}
