public class RemoveSpecialChar {
  public static void main(String[] args) {
    String s = "$P*r;e..pi, ns'ta^?";
    s = s.replaceAll("[^A-Za-z]*", "");
    System.out.println(s);
  }
}
