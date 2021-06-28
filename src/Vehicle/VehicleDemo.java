package Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 21;
        range = minivan.fuelCapacity * minivan.mpg;
        System.out.println("Minivan can transport " + minivan.passengers +
                " passangers at a distance of " + range + " miles");
    }
}
