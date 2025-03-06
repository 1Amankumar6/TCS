import java.util.Scanner;

public class sumPrime {
  // Function to check if a number is prime
  public static int prime_or(int num) {
    if (num <= 1) {
      return 0;
    }
    if(num == 2) return 1 ;
    if(num % 2 == 0) return 0;
    for(int i=2 ; i<= Math.sqrt(num); i+=2){
      if(num % i == 0) return 0 ;
    }
    return 1 ; 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();

    // Variable to indicate if a pair is found
    int x = 0;

    // Iterate through possible numbers and check if they are prime
    for (int i = 2; i <= num / 2; i++) {
      if (prime_or(i) == 1) { // Check if i is prime
        if (prime_or(num - i) == 1) { // Check if (num - i) is prime
          System.out.println(num + " = " + i + " + " + (num - i)); // Print the pair
          x = 1;
          break; // Exit after finding the first valid pair
        }
      }
    }

    if (x == 0) {
      System.out.println("No pair of prime numbers found that sum up to " + num);
    }

    sc.close();
  }
}
