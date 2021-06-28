package em;

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println("Typical speed of the airplane: "
                + Transport.AIRPLANE.getSpeed());
        System.out.println("Typical speeds of the transport machines");
        for (Transport transport : Transport.values())
            System.out.println(transport + ": " + transport.getSpeed() +
                    " km in hour");
        int a = 0;

    }
}
