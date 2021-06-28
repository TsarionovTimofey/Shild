package Syntax;

public class ByThrees implements Series {
    int start;
    int val;
    int prev;

    public ByThrees() {
        start = 0;
        val = 0;
        prev = -3;
    }

    @java.lang.Override
    public int getNext() {
        prev = val;
        val += 3;
        return val;
    }

    @java.lang.Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -3;
    }

    @java.lang.Override
    public void setStart(int x) {
        start = x;
        val = x;
    }

    int getPrevious() {
        return prev;
    }
}
