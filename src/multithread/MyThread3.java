package multithread;

public class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    public static MyThread3 createAndStart (String threadName) {
        MyThread3 myThread3 = new MyThread3(threadName);
        myThread3.start();
        return myThread3;
    }

    public void run() {
        System.out.println(getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName()
                        + ", counter: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " - interrupted");
        }
        System.out.println(getName() + " complete");
    }
}
