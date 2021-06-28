package Vehicle;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        int rangeMinivan, rangeSportCar;

        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelCapacity = 14;
        sportCar.mpg = 12;

        rangeMinivan = minivan.fuelCapacity * minivan.mpg;
        rangeSportCar = sportCar.fuelCapacity * sportCar.mpg;
        System.out.println("Minivan can transport " + minivan.passengers +
                " passangers at a distance of " + rangeMinivan + " miles");
        System.out.println("Sportcar can transport " + sportCar.passengers +
                " passangers at a distance of " + rangeSportCar + " miles");
    }
}
