package em;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport transport1, transport2, transport3;
        System.out.println("Constants enum and his values");
        for (Transport transport : Transport.values())
            System.out.println(transport + " " + transport.ordinal());

        transport1 = Transport.AIRPLANE;
        transport2 = Transport.TRAIN;
        transport3 = Transport.AIRPLANE;

        System.out.println();

        if (transport1.compareTo(transport2) < 0) {
            System.out.println(transport1 + " before " + transport2);
        }
        if (transport1.compareTo(transport2) > 0) {
            System.out.println(transport1 + " after " + transport2);
        }
        if (transport1.compareTo(transport3) == 0) {
            System.out.println(transport1 + " is equal for " + transport2);
        }
    }
}
