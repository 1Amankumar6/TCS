import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongLimit {
  static boolean isArmstrongNumber(int n, int k) {
    int sum = 0;
    int orginalNum = n;
    while (orginalNum > 0) {
      int digit = orginalNum % 10;
      sum += Math.pow(digit, k);
      orginalNum /= 10;
    }
    return sum == n;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number seperated by comma's");
    String input = s.nextLine();
    String[] arr = input.split(",");
    ArrayList<String> numbers = new ArrayList<>();
    for (String num : arr) {
      numbers.add(num);
    }
    int flag = 0;
    for (String num_str : numbers) {
      int num = Integer.parseInt(num_str);
      int n = num_str.length();
      if (isArmstrongNumber(num, n)) {
        System.out.print(num + " ");
        flag = 1;
      }
    }
    if (flag == 0) {
      System.out.println("No armstrong numbers present");
    }
    s.close();
  }
}
