package Vehicle;

public class Vehicle {
    int passengers;
    int fuelCapacity;
    int mpg;

    void range() {
        System.out.println("Range - " + fuelCapacity * mpg + " miles");
    }

    int rangeInt() {
        return mpg * fuelCapacity;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
