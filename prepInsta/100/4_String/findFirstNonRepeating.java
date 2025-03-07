public class findFirstNonRepeating {
  public static void main(String[] args) {
    String inputStr = "prepinsta";
    boolean flag = true;
    for (char i : inputStr.toCharArray()) {
      if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
        System.out.println("First non-repeating character is: " + i);
        flag = false;
        break;
      }
    }
    if (flag)
      System.out.println("There is no repeating character in input string");
  }
}
