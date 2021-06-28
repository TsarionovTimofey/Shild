package exceptions;

public class CustomExceptDemo {
    public static void main(String[] args) {
        int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NotIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + denom[i] +
                        " is equal to " + numer[i] / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException |
                    NotIntResultException e) {
                System.out.println(e);
            }
        }
    }
}
