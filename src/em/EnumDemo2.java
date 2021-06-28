package em;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp = Transport.AIRPLANE;
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        System.out.println("Transport constants: ");
        for (Transport transport: Transport.values()) System.out.println(transport);
        System.out.println();
        System.out.println(Transport.valueOf("AIRPLANE"));

    }
}
