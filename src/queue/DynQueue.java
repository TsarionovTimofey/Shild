package queue;

public class DynQueue implements ICharQ {
    private char[] q;
    private int putLock, getLock;

    public DynQueue(int size) {
        q = new char[size];
        putLock = getLock = 0;
    }

    @Override
    public void put(char ch) {
        if (putLock == q.length) {
            char[] t = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) t[i] = q[i];
            q = t;
        }
        q[putLock++] = ch;
    }

    @Override
    public char get() {
        if (getLock == putLock) {
            System.out.println(" -Queue is empty");
            return (char) 0;
        }
        return q[getLock++];
    }
    @Override
    public void reset() {
        putLock = getLock = 0;
    }
}
