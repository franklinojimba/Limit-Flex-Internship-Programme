package files.UdemyLessons;

public class AutomationLoops {
    public static void calculateInterest(double money){
        for (double interest = 7.5; interest <= 10; interest += 0.25 ) {
            double interestRate = (money*(interest/100));
            System.out.println("The interest rate of $" + money + " at " + interest + "% is $" + interestRate);
        }
    }

    public static void main() {

         calculateInterest(1000.00);
    }
}
