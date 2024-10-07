import library.Book;

public class Main {
    public static void main(String[] args) {
        library.Book myBook = new library.Book("elder rings", "Hamza");
        System.out.println(myBook.getBookinfo());

        myBook.borrowBook();

        myBook.borrowBook();

        myBook.returnBook();

    }
}
