import java.io.*;
import static java.lang.Math.*;

public class imp2_Quadroot {
  public static void main(String[] args) {
    int a = 1, b = -7, c = -10;/*  Roots are real and different.
                              *    Root 1: 8.2169905660283
                              *    Root 2: -1.2169905660283016
                              */
    // Function call
    findRoots(a, b, c);
  }

  static void findRoots(int a, int b, int c) {
    if (a == 0) {
      System.out.println("Invalid quadratic equation (a cannot be zero).");
      return;
    }

    int d = b * b - 4 * a * c;  // discriminant
    double sqrt_val = sqrt(abs(d));  // square root of absolute value of discriminant

    if (d > 0) {  // Two real and different roots
      System.out.println("Roots are real and different.");
      System.out.println("Root 1: " + (-b + sqrt_val) / (2 * a));
      System.out.println("Root 2: " + (-b - sqrt_val) / (2 * a));
    } else if (d == 0) {  // Two real and same roots
      System.out.println("Roots are real and the same.");
      System.out.println("Root: " + (-b) / (2 * a));
    } else {  // Complex roots
      System.out.println("Roots are complex.");
      double realPart = -(double) b / (2 * a);
      double imaginaryPart = sqrt_val / (2 * a);
      System.out.println("Root 1: " + realPart + " + i" + imaginaryPart);
      System.out.println("Root 2: " + realPart + " - i" + imaginaryPart);
    }
  }
}
