public class CharSwitchExample {
    public static void main(String[] args) {
        char grade = 'B';

      // you can use String or boolean instead of char labels.
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
