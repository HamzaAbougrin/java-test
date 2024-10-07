package library;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook (){
        if (this.isAvailable){
            this.isAvailable = false;
            System.out.println("Book is available");
        }
        else {
            System.out.println("Book is not available");
        }
    }
    public void returnBook(){
        if (this.isAvailable){
            this.isAvailable = true;
            System.out.println("Book is returned");
        }
        else {
            System.out.println("\"" + title + "\" is already returned.");
        }
    }
    public String getBookinfo(){
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
