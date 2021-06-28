package gen;

public class MyClass<T> implements Containment {
    T[] arrayRef;

    public MyClass(T[] o) {
        arrayRef = o;
    }

    @Override
    public boolean contains(Object o) {
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}
