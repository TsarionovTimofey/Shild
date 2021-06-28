package exceptions;

public class NotIntResultException extends Exception {
    int n;
    int d;

    public NotIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Result operation " + n + " / " + d +
                " is not a int number";
    }
}
