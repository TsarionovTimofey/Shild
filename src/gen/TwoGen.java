package gen;

public class TwoGen<T, V> {
    private T object1;
    private V object2;

    public TwoGen(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    void showTypes() {
        System.out.println("Type T is - " + object1.getClass().getName());
        System.out.println("Type T is - " + object2.getClass().getName());
    }

    public T getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }
}
