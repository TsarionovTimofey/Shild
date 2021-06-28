package Syntax;

public class HomeStack {
    private char[] q;
    private int putLock;


    HomeStack(int size) {
        q = new char[size];
        putLock = 0;
    }

    void push(char ch) {
        if (putLock == q.length) {
            System.out.println(" - The stack is full");
            return;
        } else {
            q[putLock++] = ch;
            System.out.println(q);
            System.out.println(putLock);
        }
    }

    char pop() {
        if (putLock == 0) {
            System.out.println(" - The stack is empty");
            return (char) 0;
        } else {
            System.out.println(q);
            System.out.println(putLock);
            return (q[((putLock--) - 1)]);
        }
    }

    public static void main(String[] args) {
        HomeStack obj1 = new HomeStack(10);
        for (int i = 0 + 65; i < 12 + 65; i++) {
            obj1.push((char) i);
        }
        for (int i = 0; i < 12; i++) {
            obj1.pop();
        }
        for (int i = 0 + 80; i < 12 + 80; i++) {
            obj1.push((char) i);
        }
    }
}