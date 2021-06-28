package multithread;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked")) wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
