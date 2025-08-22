package files.WeekendAlgorithmChallenge.LibrarySystem;

public class Library {
    static class Book{
        String name;
        String author;
        int year;

        public Book(String author, String name, int year) {
            this.author = author;
            this.name = name;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book -> [" +
                    "Author='" + author + '\'' +
                    ", Name='" + name + '\'' +
                    ", Year=" + year +
                    ']';
        }
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book("John Reginald", "Little Challenges", 1997);
        books[1] = new Book("Mary Slessor", "Destiny Changer", 2018);
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
