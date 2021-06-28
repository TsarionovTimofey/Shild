package em;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp = Transport.AIRPLANE;
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;
        if (tp == Transport.TRAIN) System.out.println("tp contein Train");

        switch (tp) {
            case CAR:
                break;
            case BOAT:
                System.out.println("aaaa");
                break;
        }
    }
}
