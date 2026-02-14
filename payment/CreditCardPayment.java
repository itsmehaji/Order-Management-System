package payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount){
        System.out.println("Payment Successful via credit card: "+ amount);
    }
}
