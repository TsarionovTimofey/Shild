package gen;

public class UseBoundedWildcard {

    static void test(Gen<? extends A> obj) {
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w1 = new Gen<>(a);
        Gen<B> w2 = new Gen<>(b);
        Gen<C> w3 = new Gen<>(c);
        Gen<D> w4 = new Gen<>(d);

        test(w1);
        test(w2);
        test(w3);

//        test(w4);
    }
}
