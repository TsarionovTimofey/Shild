package gen;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(88);
        Gen<String> stringGen = new Gen<>("Test");
        Gen raw = new Gen(98.6);
        double d = (double) raw.getObj();
        System.out.println(d);

//        int i = (Integer) raw.getObj();
        stringGen = raw;
//        String str = stringGen.getObj();
        raw = integerGen;
//        d = (Double) raw.getObj();
    }
}
