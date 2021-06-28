package em;

public enum TrafficLightColor {
    RED(12*1000), GREEN(10*1000), YELLOW(2*1000);
    private int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
