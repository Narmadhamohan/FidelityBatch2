  public class ValueOfExample {

    public static void main(String[] args) {
        // Converting Strings to Wrapper Objects using valueOf()
        String ageString = "25";
        String ratingString = "8.5";

        // Integer.valueOf() returns an Integer object
        Integer voterAge = Integer.valueOf(ageString);
        System.out.println("Voter's Age (as Integer object): " + voterAge);

        // Double.valueOf() returns a Double object
        Double preferenceRating = Double.valueOf(ratingString);
        System.out.println("Voter's Preference Rating (as Double object): " + preferenceRating);

        // Handling possible null values
        String nullString = null;
        try {
            // Trying to convert null using valueOf() (would throw a NullPointerException)
            Integer nullInteger = Integer.valueOf(nullString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is null or invalid for Integer.");
        }

        // Converting wrapper objects back to primitive types
        int agePrimitive = voterAge; // Autounboxing Integer to int
        double ratingPrimitive = preferenceRating; // Autounboxing Double to double

        System.out.println("Age as primitive int: " + agePrimitive);
        System.out.println("Rating as primitive double: " + ratingPrimitive);
    }
}
