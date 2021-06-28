package Syntax;

public class HomeWorkInchToMeterTable {
    public static void main(String[] args) {
        double meter, inch;
        int counter;
        counter = 0;
        for (meter = 1; meter <= 100; meter++) {
            inch = meter * 39.3701;
            System.out.println(meter + " метрам соответствует " + inch + " дюйма.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
