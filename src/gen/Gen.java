package gen;

public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type T is - " + obj.getClass().getName());
    }
}
