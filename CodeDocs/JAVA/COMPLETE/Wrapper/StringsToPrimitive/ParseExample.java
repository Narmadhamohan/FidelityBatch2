public class ParseExample {

    public static void main(String[] args) {
        // Converting Strings to Primitive Types using parseInt() and parseDouble()
        String ageString = "25";
        String ratingString = "8.5";

        // Integer.parseInt() returns an int primitive
        int voterAge = Integer.parseInt(ageString);
        System.out.println("Voter's Age (as int primitive): " + voterAge);

        // Double.parseDouble() returns a double primitive
        double preferenceRating = Double.parseDouble(ratingString);
        System.out.println("Voter's Preference Rating (as double primitive): " + preferenceRating);

        // Handling invalid input using parseInt() and parseDouble()
        String invalidString = "abc";
        try {
            // This will throw a NumberFormatException for invalid input
            int invalidAge = Integer.parseInt(invalidString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for Integer.");
        }

        try {
            // This will throw a NumberFormatException for invalid input
            double invalidRating = Double.parseDouble(invalidString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for Double.");
        }
    }
}
