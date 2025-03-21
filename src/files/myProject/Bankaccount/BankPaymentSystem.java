package files.myProject.Bankaccount;
interface Payment{
    public void processPayment();
}
class CreditCardPayment implements Payment{
    public void processPayment(){
        System.out.println("You have chosen the credit card payment method.");
    }
}
class PayPalPayment implements Payment{
    public void processPayment(){
        System.out.println("You have chosen the paypal payment method.");
    }
}
public class BankPaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.processPayment();

        PayPalPayment payPal = new PayPalPayment();
        payPal.processPayment();

    }
}
