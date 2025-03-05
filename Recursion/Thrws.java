package TCS.Recursion;
import java.util.Scanner;

// Define a custom exception class
class InvalidDenominatorException extends Exception {
    public InvalidDenominatorException(String message) {
        super(message);
    }
}

public class Thrws {
    
    // Method that will handle invalid denominator
    public void invalidDeno(String s){
        System.out.println("Invalid denominator: " + s);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input values for numerator and denominator
        System.out.print("Enter numerator: ");
        int numer = s.nextInt();
        System.out.print("Enter denominator: ");
        int deno = s.nextInt();

        int val = Integer.MAX_VALUE; // Default value for calculation

        try {
            // Attempt division
            if (deno == 0) {
                // If denominator is 0, throw a custom exception
                throw new InvalidDenominatorException("Denominator cannot be zero");
            }
            val = numer / deno;
            System.out.println("Result: " + val);

        } catch (InvalidDenominatorException e) {
            // Handle custom exception
            System.out.println("Caught Exception: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for debugging

        } catch (ArithmeticException e) {
            // Handle generic arithmetic exception (for divide-by-zero cases)
            System.out.println("Arithmetic error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            s.close(); // Close the scanner resource to avoid resource leak
        }
    }
}
