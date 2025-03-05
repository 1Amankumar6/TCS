class Imp_BalancedParentheses{

  static void generateParentheses(char[] parentheses, int currentPos, int totalPairs, int openCount, int closeCount) {
   
    if (closeCount == totalPairs) {
      for (int i = 0; i < parentheses.length; i++) {
        System.out.print(parentheses[i]);
      }
      System.out.println();
      return;
    } else {
      // If open parentheses are more than close, we can add a closing parenthesis
      if (openCount > closeCount) {
        parentheses[currentPos] = ')'; // Add a closing parenthesis
        generateParentheses(parentheses, currentPos + 1, totalPairs, openCount, closeCount + 1);
      }
      // If we have not used all open parentheses, we can add an opening parenthesis
      if (openCount < totalPairs) {
        parentheses[currentPos] = '('; // Add an opening parenthesis
        generateParentheses(parentheses, currentPos + 1, totalPairs, openCount + 1, closeCount);
      }
    }
  }

  // Function to initialize the parentheses generation process
  static void printBalancedParentheses(char[] parentheses, int totalPairs) {
    if (totalPairs > 0)
      generateParentheses(parentheses, 0, totalPairs, 0, 0);
  }

  public static void main(String[] args) {
    int totalPairs = 3; // Number of pairs of parentheses
    char[] parentheses = new char[2 * totalPairs]; // Array to store the parentheses
    printBalancedParentheses(parentheses, totalPairs);
  }
}
