public class replaceby1 {
  public static void main(String[] args) {
    int n = 706120678;
    String val = String.valueOf(n);
    val = val.replaceAll("0", "1");
    System.out.println(val);
  }  
}
