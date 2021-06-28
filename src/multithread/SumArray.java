package multithread;

public class SumArray {
    private int sum;

    synchronized int sumArray(int numbers[]) {
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Current value sum for "
                    + Thread.currentThread().getName() + " is " + sum);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return sum;
    }
}
