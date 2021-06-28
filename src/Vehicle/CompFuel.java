package Vehicle;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelCapacity = 14;
        sportCar.mpg = 12;

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
