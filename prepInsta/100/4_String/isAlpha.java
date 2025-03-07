public class isAlpha {
  public static void main(String[] args) {
    char ch;
    ch = 'a';
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
      System.out.println("The inserted character is " + ch + " is Alphabet.");
    else
      System.out.println("The inserted character is " + ch + " is not an Alphabet.");
  }
}
