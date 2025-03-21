package files.myProject.Rentals;
class Book{
    private String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private boolean bookAvailable;

    public Book(String bookTitle, String bookAuthor, int bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookAvailable = true;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public int getBookYear() {
        return bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    public boolean isBookAvailable() {
        return bookAvailable;
    }
    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    public void borrowBook(){
        if(bookAvailable){
            bookAvailable = false;
            System.out.println("You have borrowed this book --> " + bookTitle);
        }
        else {
            System.out.println(bookTitle + " has already been borrowed");
        }
    }
    public void returnBook(){
        if(!bookAvailable){
            bookAvailable = true;
            System.out.println("You have returned " + bookTitle);
        }
        else {
            System.out.println(bookTitle +" was not borrowed");
        }
    }
    public void displayBook(){
        System.out.println("Book Title: " + bookTitle + " | Book Author: " + bookAuthor+ " | Book Year: " + bookYear + " | Book Availability: " + bookAvailable);
        }
    }
public class LibrarySystem {
    public static void main(String[] args) {
        Book myBook = new Book("My Book Title", "My Book Author", 1990);
        myBook.setBookTitle("Diary of a Mad Black woman");
        myBook.setBookYear(2001);
        myBook.setBookAuthor("Tyler Perry");
        myBook.setBookAvailable(true);
        myBook.displayBook();
        myBook.borrowBook();
        myBook.displayBook();
        myBook.returnBook();
        myBook.displayBook();
        myBook.borrowBook();
        myBook.borrowBook();
    }
}
/*Library System - Design a library system that encapsulates book details and allows
borrowing/returning*/