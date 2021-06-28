package gen;

public class GenArrays {
    public static void main(String[] args) {
        Gen2<Integer> integerGen2 = new Gen2<>(50, new Integer[]{1, 2, 3, 4, 5});
        Gen2<Integer> gen2[] = new Gen2[10];
        Gen2<?> gens[] = new Gen2[10];
    }
}
