package files.myProject.Bankaccount;
class BankAccount{
double bankBalance = 67000;
public void interestCalculator(double interestRate) {
    System.out.println("Interest Rate: " + interestRate + "%");
}
}
class SavingsAccount extends BankAccount{
    public void interestCalculator(double interestRate) {
        bankBalance = bankBalance * interestRate;
        System.out.println("New balance: " + bankBalance);
    }
}
public class BankAccountInterest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.interestCalculator(5);
        BankAccount bankAccount = new BankAccount();
        bankAccount.interestCalculator(5);
    }
}
