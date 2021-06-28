package bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            books[i] = new Book(i + " ", i + " ", i);
        }
        for (Book book : books) book.show();
    }

}
