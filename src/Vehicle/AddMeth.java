package Vehicle;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelCapacity = 14;
        sportCar.mpg = 12;

        System.out.println("Minivan can transport " + minivan.passengers +
                " passangers.");
        minivan.range();
        System.out.println("Sportcar can transport " + sportCar.passengers +
                " passangers.");
        sportCar.range();
    }

    void myMeth() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println();
        }
    }
}
