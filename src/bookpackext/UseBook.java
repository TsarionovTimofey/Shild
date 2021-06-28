package bookpackext;

import bookpack.*;

public class UseBook {
    public static void main(String[] args) {
        Book[] books = new bookpack.Book[5];

        for (int i = 0; i < 5; i++) {
            books[i] = new Book(i + " ", i + " ", i);
        }
        for (bookpack.Book book : books) book.show();
    }
}
