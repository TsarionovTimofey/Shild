package Syntax;

public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " in degree " + x.e + "is equal " + x.get_pwr());
        System.out.println(y.b + " in degree " + y.e + "is equal " + y.get_pwr());
        System.out.println(z.b + " in degree " + z.e + "is equal " + z.get_pwr());
    }
}
