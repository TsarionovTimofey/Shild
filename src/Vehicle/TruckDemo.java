package Vehicle;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Cargo can transport " + semi.getCargoCap());
        System.out.println("To overcome " + dist +
                " miles cargo will need " + gallons + " gallons of fuel");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("pickup can transport " + pickup.getCargoCap());
        System.out.println("To overcome " + dist +
                " miles pickup will need " + gallons + " gallons of fuel");
    }
}
