// Main class to demonstrate the payment processing system
public class PaymentGatewaySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get payment type from user
        System.out.println("Enter payment method (credit or paypal): ");
        String paymentMethod = scanner.nextLine().toLowerCase();

        // Get payment amount from user
        System.out.println("Enter payment amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        OnlinePayment paymentProcessor = null;

        // Process payment based on user input
        if (paymentMethod.equals("credit")) {
            // Get credit card details from user
            System.out.println("Enter your credit card number: ");
            String cardNumber = scanner.nextLine();
            
            // Create a CreditCardProcessor and process the payment
            paymentProcessor = new CreditCardProcessor(cardNumber);
        } else if (paymentMethod.equals("paypal")) {
            // Get PayPal email from user
            System.out.println("Enter your PayPal email: ");
            String email = scanner.nextLine();
            
            // Create a PayPalProcessor and process the payment
            paymentProcessor = new PayPalProcessor(email);
        } else {
            System.out.println("Invalid payment method. Please enter 'credit' or 'paypal'.");
        }

        // If a valid payment processor is created, process the payment
        if (paymentProcessor != null) {
            paymentProcessor.processPayment(amount);
        }

        scanner.close();
    }
}
