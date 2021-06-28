package Test;


import queue.*;

public class IQDemo {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        DynCircularQueue q4 = new DynCircularQueue(10);
        ICharQ iQ;
        char ch;
        int i;

        iQ = q1;
        for (i = 0; i < 10; i++) iQ.put((char) ('A' + i));
        System.out.println("Content FixedQueue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++) iQ.put((char) ('Z' - i));
        System.out.println("Content DynQueue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        System.out.println("Content CircularQueue: ");
        for (i = 0; i < 10; i++) iQ.put((char) ('A' + i));
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Content CircularQueue: ");
        for (i = 10; i < 20; i++) iQ.put((char) ('A' + i));
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Save and usage CircularQueue data");
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q4;
        System.out.println("Content DynCircularQueue: ");
        for (i = 0; i < 30; i++) iQ.put((char) ('A' + i));
        for (i = 0; i < 20; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        for (i = 0; i < 30; i++) iQ.put((char) ('A' + i));
        for (i = 0; i < 70; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
