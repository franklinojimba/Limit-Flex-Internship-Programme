package files.UdemyLessons.BankAccount;

public class Customer {
    private final String firstName;
    private final String email;
    private final double creditLimit;

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer(String firstName, String email, double creditLimit) {
        this.firstName = firstName;
        this.email = email;
        this.creditLimit = creditLimit;
    }
    public Customer() {
        this("Franklin", "frank@gmail.com", 50000);
    }
    public Customer(String firstName, String email) {
        this(firstName, email, 50000);
    }
}
