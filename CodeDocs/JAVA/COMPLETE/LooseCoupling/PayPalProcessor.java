// PayPalProcessor class that implements the OnlinePayment interface
class PayPalProcessor implements OnlinePayment {

    private String email;

    // Constructor to initialize PayPal email
    public PayPalProcessor(String email) {
        this.email = email;
    }

    // Implement the processPayment method from OnlinePayment interface
    @Override
    public void processPayment(double amount) {
        validatePaymentDetails();
        System.out.println("Processing PayPal payment of $" + amount + " for email " + email);
    }

    // Method to validate PayPal account details
    private void validatePaymentDetails() {
        // Simulate PayPal account validation
        System.out.println("Validating PayPal account for email " + email);
    }
}
