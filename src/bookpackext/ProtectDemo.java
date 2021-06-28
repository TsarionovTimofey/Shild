package bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        for (int i = 0; i < 5; i++) {
            books[i] = new ExtBook(i + "", i + "", i, i + "");
        }
        System.out.println("Books with author 2");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals("2"))
                System.out.println(books[i].getTitle());
        }
//        books[0].title = "test title";
    }
}
