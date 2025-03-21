package files.myProject.Bankaccount;
public class BankAccountClass {
    int balance = 5000;
    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println(amountToDeposit + "$ deposited to your account.");
        System.out.println("Available Balance:" +balance+"$");
    }
    public void withdraw(int amountToBeWithdrawn) {
        if (amountToBeWithdrawn > balance) {
            System.out.println("Insufficient funds");
        }
        else {
            balance = balance - amountToBeWithdrawn;
            System.out.println(amountToBeWithdrawn + "$ has been withdrawn from your account.");
            System.out.println("Available Balance:" + balance+"$");
        }
    }
    public static void main(String[] args) {
        BankAccountClass myAccount = new BankAccountClass();
        myAccount.deposit(27000);
        myAccount.withdraw(100000);
    }
}
