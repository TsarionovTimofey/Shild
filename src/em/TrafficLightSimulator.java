package em;

import static em.TrafficLightColor.*;

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor trafficLightColor;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor trafficLightColor) {
        this.trafficLightColor = trafficLightColor;
    }

    TrafficLightSimulator() {
        this.trafficLightColor = RED;
    }

    synchronized void changeColor() {
        if (trafficLightColor.ordinal() < GREEN.ordinal()) {
            trafficLightColor = GREEN;
        } else if (trafficLightColor.ordinal() > GREEN.ordinal()) {
            trafficLightColor = RED;
        } else {
            trafficLightColor = YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) wait();
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }

    synchronized void cancel() {
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                switch (trafficLightColor) {
                    case GREEN:
                        Thread.sleep(trafficLightColor.getDelay());
                        break;
                    case YELLOW:
                        Thread.sleep(trafficLightColor.getDelay());
                        break;
                    case RED:
                        Thread.sleep(trafficLightColor.getDelay());
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }
}
