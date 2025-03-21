package files.myProject;
import java.util.Objects;
import java.util.Scanner;

//Use KL8BN as promo code to get this book for 60% off!!!

public class BookManagementSystem {
    private final String bookTitle = "The Philosophy of Man";
    private final String bookAuthor = "Faith Ovie";
    private final double bookPrice = 19000;
    public double discount(){
        return bookPrice * 0.6;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        BookManagementSystem bookManagementSystem = new BookManagementSystem();
        double discountPrice = bookManagementSystem.discount();
        System.out.println(bookManagementSystem.bookTitle);
        System.out.println(bookManagementSystem.bookAuthor);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the promo code: ");
        String promoCode = scanner.nextLine();
        if (Objects.equals(promoCode, "KL8BN")){
            System.out.println("You are getting this book for 60% off");
            System.out.print("Discounted Price: " + discountPrice + "$");
        }
        else {
            System.out.println("You are getting this book for "+ bookManagementSystem.bookPrice + "$");
        }
        scanner.close();

    }

}
