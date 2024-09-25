public class SimpleCalculations {

    public static void main(String[] args) {
        // 1. 10% Discount on a Product
        double price = 100.0;  // Example price
        double discountedPrice = price * 0.90;
        System.out.println("Discounted Price (10% off): " + discountedPrice);

        // 2. Total Bill with 18% Tax (GST/VAT)
        double totalPriceWithTax = price * 1.18;
        System.out.println("Total Price with 18% Tax: " + totalPriceWithTax);

        // 3. Monthly Loan Payment using Simple Interest
        double principal = 1000.0;  // Example principal
        double rate = 5.0;  // Interest rate in percentage
        int time = 1;  // Time in years
        double monthlyPayment = (principal * rate * time / 100) / 12;
        System.out.println("Monthly Loan Payment: " + monthlyPayment);

        // 4. Convert Temperature from Fahrenheit to Celsius
        double fahrenheit = 98.6;  // Example temperature in Fahrenheit
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);

        // 5. Area of a Circle
        double radius = 7.0;  // Example radius
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the Circle: " + area);

        // 6. Compound Interest Calculation
        double compoundInterest = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
