package multithread;

public class Suspend {
    public static void main(String[] args) {
        MyThread6 myThread = MyThread6.createAndStart("My thread");
        try {
            Thread.sleep(1000);

            myThread.mySuspend();
            System.out.println("Stop thread");
            Thread.sleep(1000);

            myThread.myResume();
            System.out.println("Resume thread");
            Thread.sleep(1000);

            myThread.mySuspend();
            System.out.println("Stop thread");
            Thread.sleep(1000);

            myThread.myResume();
            System.out.println("Resume thread");
            Thread.sleep(1000);

            myThread.mySuspend();
            System.out.println("Stop thread");
            myThread.myStop();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        try {
            myThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println("Main thread exit");
    }
}
