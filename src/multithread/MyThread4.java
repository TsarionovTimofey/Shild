package multithread;

public class MyThread4 implements Runnable {
    Thread thread;
    static SumArray sumArray = new SumArray();
    int[] numbers;
    int answer;

    MyThread4(String name, int numbers[]) {
        thread = new Thread(this, name);
        this.numbers = numbers;
    }

    public static MyThread4 createAndStart(String name, int numbers[]) {
        MyThread4 myThread4 = new MyThread4(name, numbers);
        myThread4.thread.start();
        return myThread4;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " -start");
        answer = sumArray.sumArray(numbers);
        System.out.println("Sum for " + thread.getName() + " is " + answer);
        System.out.println(thread.getName() + " - complete");
    }
}
