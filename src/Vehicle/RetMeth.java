package Vehicle;

public class RetMeth {
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

        rangeMinivan = minivan.rangeInt();
        rangeSportCar = sportCar.rangeInt();

        System.out.println("Minivan can transport " + minivan.passengers +
                " passangers at a distance of " + rangeMinivan + " miles");
        System.out.println("Sportcar can transport " + sportCar.passengers +
                " passangers at a distance of " + rangeSportCar + " miles");

        System.out.println("Minivan can transport " + minivan.passengers +
                " passangers at a distance of " + minivan.rangeInt() + " miles");
        System.out.println("Sportcar can transport " + sportCar.passengers +
                " passangers at a distance of " + sportCar.rangeInt() + " miles");
    }
}
