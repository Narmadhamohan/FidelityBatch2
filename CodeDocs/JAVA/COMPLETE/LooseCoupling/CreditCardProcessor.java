// CreditCardProcessor class that implements the OnlinePayment interface
class CreditCardProcessor implements OnlinePayment {

    private String cardNumber;

    // Constructor to initialize card details
    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implement the processPayment method from OnlinePayment interface
    @Override
    public void processPayment(double amount) {
        validatePaymentDetails();
        System.out.println("Processing credit card payment of $" + amount + " for card number " + cardNumber);
    }

    // Method to validate credit card details
    private void validatePaymentDetails() {
        // Simulate card number validation
        System.out.println("Validating credit card details for card number " + cardNumber);
    }
}
