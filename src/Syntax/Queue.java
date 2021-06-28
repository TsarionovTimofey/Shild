package Syntax;

public class Queue {
    private char[] q;
    private int[] e;
    private int putLock, getLock;


    Queue(int size, String type) {
        if (type.equals("char")) {
            q = new char[size];
        } else if (type.equals("int")) {
            e = new int[size];
        }
        putLock = getLock = 0;
    }

    Queue(Queue obj) {
        putLock = obj.putLock;
        getLock = obj.getLock;
        q = new char[obj.q.length];
        for (int i = getLock; i < putLock; i++) {
            q[i] = obj.q[i];
        }
    }

    Queue(char a[]) {
        putLock = 0;
        getLock = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    //For char
    void put(char ch) {
        if (putLock == q.length) {
            System.out.println(" - The queue is full");
            return;
        }
        q[putLock++] = ch;
    }

    char getChar() {
        if (getLock == putLock) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        return q[getLock++];
    }

    //For int
    void put(int i) {
        if (putLock == e.length) {
            System.out.println(" - The queue is full");
            return;
        }
        e[putLock++] = i;
    }

    int getInt() {
        if (getLock == putLock) {
            System.out.println(" - The queue is empty");
            return 0;
        }
        return e[getLock++];
    }
}
