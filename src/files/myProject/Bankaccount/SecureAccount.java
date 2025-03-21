package files.myProject.Bankaccount;
//Secure Account - Implement a bank account class with private attributes and public
//getter/setter methods.
class Account{
    private String userName;
    private int password;
    private int totalBalance;
    private int availableBalance;

    public Account(String userName, int password, int totalBalance, int availableBalance) {
        this.userName = userName;
        this.password = password;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public int getTotalBalance() {
        return totalBalance;
    }
    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }
    public int getAvailableBalance() {
        return availableBalance;
    }
    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }
    public void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Total Balance: " + totalBalance);
        System.out.println("Available Balance: " + availableBalance);
    }
}
public class SecureAccount {
    public static void main(String[] args) {
        Account account1 = new Account("name", 1234, 0, 0);
        account1.setUserName("Chibuike");
        account1.setPassword(1593);
        account1.setTotalBalance(1200000);
        account1.setAvailableBalance(1196000);
        account1.display();
    }
}
