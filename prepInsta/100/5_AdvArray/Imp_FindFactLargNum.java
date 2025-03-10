public class Imp_FindFactLargNum {
  public static void main(String args[]) {
    factorial(10);
  }

  static void factorial(int n) {
    int res[] = new int[500]; // Array to store the factorial
    res[0] = 1; // Initialize the first element
    int res_size = 1; // Current size of the result (factorial)

    // Loop from 2 to n and multiply with the result array
    for (int x = 2; x <= n; x++) {
      res_size = multiply(x, res, res_size); // Update result size after each multiplication
    }

    // Print the factorial result
    System.out.println("Factorial of given number is: ");
    for (int i = res_size - 1; i >= 0; i--) {
      System.out.print(res[i]); // Print the result in reverse order
    }
    System.out.println(); // Newline after printing the factorial
  }

  // Multiply function that calculates the factorial of a number
  static int multiply(int x, int res[], int res_size) {
    int carry = 0; // Initialize carry

    // Multiply each digit of res[] by x and store the result
    for (int i = 0; i < res_size; i++) {
      int prod = res[i] * x + carry;
      res[i] = prod % 10; // Store the last digit of the product in res[]
      carry = prod / 10; // Carry the remaining value to the next digit
    }

    // Handle the carry by adding digits to the res array
    while (carry != 0) {
      res[res_size] = carry % 10; // Store the last digit of the carry in res[]
      carry = carry / 10; // Update carry
      res_size++; // Increment the size of the result
    }

    return res_size; // Return the updated size of the result
  }
}
