package Syntax;

public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    public ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @java.lang.Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @java.lang.Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
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
