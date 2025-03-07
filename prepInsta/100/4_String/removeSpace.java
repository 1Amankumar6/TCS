public class removeSpace {
  public static void main(String[] args) {
    String s = "Prepinsta is best";
    s = s.replaceAll("\\s+", "");
    System.out.println(s);
  }
}
