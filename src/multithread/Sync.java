package multithread;

public class Sync {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        MyThread4 myThread1 =
                MyThread4.createAndStart("Thread#1", numbers);
        MyThread4 myThread2 =
                MyThread4.createAndStart("Thread#2", numbers);

        try {
            myThread1.thread.join();
            myThread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        SumArray sumArray = new SumArray();
        sumArray.sumArray(numbers);
    }

}
