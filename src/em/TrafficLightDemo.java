package em;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator trafficLightSimulator =
                new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thread = new Thread(trafficLightSimulator);
        thread.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(trafficLightSimulator.getTrafficLightColor());
            trafficLightSimulator.waitForChange();
        }
    }
}
