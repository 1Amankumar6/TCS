import java.util.Scanner;

public class numDeno {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Reading the numerator and denominator of the two fractions
    System.out.println("Enter the numerator and denominator for the first fraction:");
    int n1 = s.nextInt();  // Numerator of first fraction
    int d1 = s.nextInt();  // Denominator of first fraction
    
    System.out.println("Enter the numerator and denominator for the second fraction:");
    int n2 = s.nextInt();  // Numerator of second fraction
    int d2 = s.nextInt();  // Denominator of second fraction

    // Check if either denominator is zero
    if (d1 == 0 || d2 == 0) {
      System.out.println("Denominator cannot be zero.");
      return;  // Exit the program if either denominator is zero
    }

    // Calculate the numerator and denominator of the resulting fraction
    int numerator = (n1 * d2 + n2 * d1);
    int denominator = (d1 * d2);

    // Simplify the fraction using GCD
    int gcd = gcd(numerator, denominator);  // Find the GCD
    numerator /= gcd;  // Simplify the numerator
    denominator /= gcd;  // Simplify the denominator

    // Output the simplified fraction
    System.out.println("The result is: " + numerator + "/" + denominator);
  }

  // Helper function to calculate the GCD (Greatest Common Divisor)
  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
