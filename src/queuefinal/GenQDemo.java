package queuefinal;

public class GenQDemo {
    public static void main(String[] args) {
        GenQueue<Integer> q = new GenQueue<>(new Integer[10]);
        System.out.println("Presentation Integer Queue");
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("add " + i + " in queue q");
                q.put(i);
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();
        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("get next Integer value from queue q: ");
                System.out.println(q.get());
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();

        GenQueue<Double> q2 = new GenQueue<>(new Double[10]);
        System.out.println("Presentation Double Queue");
        try {
            for (double i = 0; i < 11; i++) {
                System.out.println("add " + i + " in queue q2");
                q2.put(i/2);
            }
        } catch (QueueFullException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("get next Integer value from queue q2: ");
                System.out.println(q2.get());
            }
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }

    }
}
