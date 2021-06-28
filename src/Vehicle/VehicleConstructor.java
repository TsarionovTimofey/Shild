package Vehicle;

public class VehicleConstructor {
    private int passengers;
    private int fuelCapacity;
    private int mpg;

    VehicleConstructor(int passengers, int fuelCapacity, int mpg) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }

    void range() {
        System.out.println("Range - " + fuelCapacity * mpg + " miles");
    }

    int rangeInt() {
        return mpg * fuelCapacity;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
