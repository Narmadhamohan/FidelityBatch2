import java.util.Scanner;
/*


Question:
Write a Java program that uses Boolean, Double, and Integer wrapper classes to store the voter's agreement status, 
age, and preference rating (out of 10). 
Demonstrate how to handle null values and convert these wrapper types back to their primitive equivalents.


*/
public class VotingApplication {

    public static void main(String[] args) {
        // Using wrapper classes to store voter's input
        Boolean agreedToTerms = null;
        Integer voterAge = null;
        Double preferenceRating = null;

        Scanner scanner = new Scanner(System.in);

        // Get agreement status from the user (optional input)
        System.out.println("Did the voter agree to the terms? (yes/no): ");
        String agreeInput = scanner.nextLine().trim().toLowerCase();
        if (!agreeInput.isEmpty()) {
            if (agreeInput.equals("yes")) {
                agreedToTerms = Boolean.TRUE;
            } else if (agreeInput.equals("no")) {
                agreedToTerms = Boolean.FALSE;
            }
        }

        // Get voter's age (optional input)
        System.out.println("Enter voter's age (optional, leave blank if unknown): ");
        String ageInput = scanner.nextLine().trim();
        if (!ageInput.isEmpty()) {
            try {
                voterAge = Integer.valueOf(ageInput); // Convert string to Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid age input. Age not recorded.");
            }
        }

        // Get voter's preference rating (out of 10, optional input)
        System.out.println("Enter voter's preference rating (out of 10, optional): ");
        String ratingInput = scanner.nextLine().trim();
        if (!ratingInput.isEmpty()) {
            try {
                preferenceRating = Double.valueOf(ratingInput); // Convert string to Double
            } catch (NumberFormatException e) {
                System.out.println("Invalid rating input. Rating not recorded.");
            }
        }

        // Output the stored data (handle nulls appropriately)
        System.out.println("\n--- Voter Information ---");
        System.out.println("Agreed to terms: " + (agreedToTerms != null ? agreedToTerms : "No input provided"));
        System.out.println("Voter's age: " + (voterAge != null ? voterAge : "No input provided"));
        System.out.println("Preference rating: " + (preferenceRating != null ? preferenceRating : "No input provided"));

        // Demonstrating conversion from wrapper class to primitive types (handling nulls)
        if (voterAge != null) {
            int agePrimitive = voterAge; // Unboxing to primitive int
            System.out.println("Voter's age as primitive int: " + agePrimitive);
        }

        if (preferenceRating != null) {
            double ratingPrimitive = preferenceRating; // Unboxing to primitive double
            System.out.println("Preference rating as primitive double: " + ratingPrimitive);
        }

        scanner.close();
    }
}
