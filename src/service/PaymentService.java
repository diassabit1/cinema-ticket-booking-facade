package service;

public class PaymentService {

    public boolean processPayment(double amount, double balance) {
        if (amount <= 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }

        System.out.println("Payment successful: $" + amount);
        return true;
    }
}
