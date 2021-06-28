package Vehicle;

public class VehicleConsDemo {
    public static void main(String[] args) {

        VehicleConstructor minivan =
                new VehicleConstructor(7, 16, 21);
        VehicleConstructor sportCar =
                new VehicleConstructor(2, 14, 12);
        double gallons;
        int dist = 252;
        gallons = minivan.fuelNeeded(dist);
        System.out.println("To overcome " + dist +
                " miles by minivan, you will need " + gallons +
                " gallons of fuel");
        gallons = sportCar.fuelNeeded(dist);
        System.out.println("To overcome " + dist +
                " miles by sportCar, you will need " + gallons +
                " gallons of fuel");
    }
}
