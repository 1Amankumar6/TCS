public class LengthString {
  public static void main(String[] args) {
    String str = "aman is a good boy.";
    System.out.println(lengthStr(str));
  }

  static int lengthStr(String str) {
    if (str.equals(""))
      return 0;
    else
      return lengthStr(str.substring(1)) + 1;
  }
}
