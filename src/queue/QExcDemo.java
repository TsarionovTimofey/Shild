package queue;


public class QExcDemo {
    public static void main(String[] args) {
        FixedQueueExc q = new FixedQueueExc(10);
        char ch;
        int i;
        try {
            for (i = 0; i < 11; i++) {
                System.out.print("attempt to save: " + (char) ('A'));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();
        try {
            for (i = 0; i < 11; i++) {
                ch = q.get();
                // System.out.println("Get the next symbo: " + ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}
