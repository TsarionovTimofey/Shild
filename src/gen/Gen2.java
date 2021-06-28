package gen;

public class Gen2<T extends Number> {
    T obj;
    T vals[];

    public Gen2(T obj, T[] nums) {
        this.obj = obj;
        vals = nums;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type T is - " + obj.getClass().getName());
    }

}
