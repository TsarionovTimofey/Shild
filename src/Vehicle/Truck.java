package Vehicle;

public class Truck extends VehicleConstructor {
    private int cargoCap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargoCap = c;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }
}
