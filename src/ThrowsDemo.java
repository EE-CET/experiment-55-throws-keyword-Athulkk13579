import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            try {
                if (age < 18) {
                    throw new InvalidAgeException("Not eligible to vote");
                } else {
                    System.out.println("Eligible to vote");
                }
            } catch (InvalidAgeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
