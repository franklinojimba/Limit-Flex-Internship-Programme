package files.UdemyLessons.BankAccount;

public class ConstructorsChallenge {
    public static void main(String[] ignoredArgs) {
        Customer customer = new Customer("John", "john@example.com", 70000);
        System.out.println("Username: " + customer.getFirstName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Credit Limit: " + customer.getCreditLimit());

        Customer customer2 = new Customer();
        System.out.println("Username: " + customer2.getFirstName());
        System.out.println("Email: " + customer2.getEmail());
        System.out.println("Credit Limit: " + customer2.getCreditLimit());

        Customer customer3 = new Customer("John", "john@example.com");
        System.out.println("Username: " + customer3.getFirstName());
        System.out.println("Email: " + customer3.getEmail());
        System.out.println("Credit Limit: " + customer3.getCreditLimit());

    }
}
