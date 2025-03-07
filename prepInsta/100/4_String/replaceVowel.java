public class replaceVowel {
  public static void main(String[] args) {
    String str= "Aman is a good boy.";
    String newStr = "";
    newStr = str.replaceAll("[aeiou]", " ");
    System.out.println(newStr);
  }
}
