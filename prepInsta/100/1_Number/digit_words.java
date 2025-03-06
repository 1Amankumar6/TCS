public class digit_words {
  public static void main(String[] args) {
      // Example: 2903 = two thousand nine hundred three
      convert("123".toCharArray());
  }

  static void convert(char[] num) {
      int len = num.length;
      if (len == 0) {
          System.out.println("Empty string");
          return;
      }
      if (len > 4) {
          System.out.println("Length more than 4 is not supported");
          return;
      }

      // Arrays for the words of ones, two-digit numbers, multiples (tens), and powers of tens
      String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
      String[] two = { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
      String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
      String[] powers = { "", "hundred", "thousand" };

      System.out.print(String.valueOf(num) + ": ");
      
      // Handle the case for single digit number
      if (len == 1) {
          System.out.println(ones[num[0] - '0']);
          return;
      }

      int x = 0;  // Pointer to the digits
      if (len == 2) {  // Two-digit number
          if (num[x] - '0' == 1) {
              // Handle numbers between 10 and 19
              System.out.println(two[num[x + 1] - '0']);
          } else {
              // Handle numbers from 20 to 99
              System.out.print(tens[num[x] - '0'] + " ");
              if (num[x + 1] - '0' != 0) {
                  System.out.println(ones[num[x + 1] - '0']);
              }
          }
      } else if (len == 3) {  // Three-digit number
          // Hundreds place
          if (num[x] - '0' != 0) {
              System.out.print(ones[num[x] - '0'] + " " + powers[1] + " ");
          }
          x++;  // Move to the next digit
          // Two-digit number (after hundreds place)
          if (num[x] - '0' == 1) {
              System.out.print(two[num[x + 1] - '0']);
          } else {
              if (num[x] - '0' != 0) {
                  System.out.print(tens[num[x] - '0'] + " ");
              }
              if (num[x + 1] - '0' != 0) {
                  System.out.println(ones[num[x + 1] - '0']);
              }
          }
      } else if (len == 4) {  // Four-digit number
          // Thousands place
          System.out.print(ones[num[0] - '0'] + " " + powers[2] + " ");
          x++;  // Move to the next digit
          // Hundreds place
          if (num[x] - '0' != 0) {
              System.out.print(ones[num[x] - '0'] + " " + powers[1] + " ");
          }
          x++;  // Move to the next digit
          // Tens and ones places (last two digits)
          if (num[x] - '0' == 1) {
              System.out.print(two[num[x + 1] - '0']);
          } else {
              if (num[x] - '0' != 0) {
                  System.out.print(tens[num[x] - '0'] + " ");
              }
              if (num[x + 1] - '0' != 0) {
                  System.out.println(ones[num[x + 1] - '0']);
              }
          }
      }
  }
}
